abstract class Human {
    abstract val firstName: String
    abstract val lastName: String

    val name: String get() = "$firstName $lastName"
}


class Student (override val firstName: String, override val lastName: String) : Human() {

}