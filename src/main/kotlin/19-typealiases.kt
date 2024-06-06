typealias IntToBoolFunction = (Int) -> Boolean

val numToBool: IntToBoolFunction = {num ->
    when (num) {
    1 -> true
    0 -> false
    else -> throw Exception(num.toString())
}}

fun main () {
    println(numToBool(1))
    println(numToBool(0))
//    println(numToBool(10))  // error
}