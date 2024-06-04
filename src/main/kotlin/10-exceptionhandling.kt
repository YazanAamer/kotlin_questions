fun divide(a: Int, b: Int): Int? {
  try { return a/b } catch (e: ArithmeticException) {
      println("Divide by 0!")
      return null}
}

fun main () {
  println(divide(6,4))
  println(divide(6,0))
}
