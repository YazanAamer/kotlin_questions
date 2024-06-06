sealed class Response (val message: String)
class Success(message: String) : Response(message)
class Error(message: String) : Response(message)
class Loading(message: String) : Response(message)

fun main () {
    val x: Response = Error("200")
    println(x.message)
    when (x) {
        is Success -> println("success")
        is Error -> println("error")
        is Loading -> println("loading")
    }
}