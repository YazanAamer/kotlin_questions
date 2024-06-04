fun main() {
    var a = 1
    var b = 2
    println("$a, $b")
    a = b.also { b = a }
    println("$a, $b")
}
