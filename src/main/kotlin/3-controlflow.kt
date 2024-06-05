fun main() {
    val a = -311
    println(determineSign(a))

    val b = 4
    println(determineDayOfWeek(b))
}

fun determineSign(number: Int): String {
    return when {
        number > 0 -> "positive"
        number < 0 -> "negative"
        else -> "zero"
    }
}

fun determineDayOfWeek(day: Int): String {
    return when (day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Invalid day"
    }
}
