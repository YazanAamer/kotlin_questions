#!/bin/bash

# Function to update the application ID in build.gradle
update_application_id() {
    local new_id=$1
    sed -i "s/applicationId \".*\"/applicationId \"$new_id\"/" app/build.gradle
}

# Function to update the package name in AndroidManifest.xml
update_manifest_package() {
    local new_id=$1
    sed -i "s/package=\".*\"/package=\"$new_id\"/" app/src/main/AndroidManifest.xml
}

# Function to update the package name in the source files
update_source_package() {
    local old_id=$1
    local new_id=$2
    local old_dir="app/src/main/java/$(echo $old_id | tr '.' '/')"
    local new_dir="app/src/main/java/$(echo $new_id | tr '.' '/')"

    mv $old_dir $new_dir
    find $new_dir -type f -name "*.java" -exec sed -i "s/$old_id/$new_id/g" {} +
    find $new_dir -type f -name "*.kt" -exec sed -i "s/$old_id/$new_id/g" {} +
}

# Main script
if [ "$#" -ne 2 ]; then
    echo "Usage: $0 <old_app_id> <new_app_id>"
    exit 1
fi

OLD_APP_ID=$1
NEW_APP_ID=$2

echo "Updating application ID in build.gradle..."
update_application_id $NEW_APP_ID

echo "Updating package name in AndroidManifest.xml..."
update_manifest_package $NEW_APP_ID

echo "Updating package name in source files..."
update_source_package $OLD_APP_ID $NEW_APP_ID

echo "Clean and rebuild the project..."
./gradlew clean
./gradlew assembleDebug

echo "Application ID successfully changed to $NEW_APP_ID"
