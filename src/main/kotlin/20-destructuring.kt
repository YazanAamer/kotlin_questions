data class User(val id: Int, val name: String, val email: String)

fun main() {
    val user = User(1, "John", "Smith@example.com")
    val (id, name, email) = user
    println("$id, $name, $email")
}