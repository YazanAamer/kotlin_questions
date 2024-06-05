fun <T: Comparable<T>> greaterValue(a: T, b: T): T? {
  if (a > b) {return a}
  if (b > a) {return b}
  return null
}


fun main () {
  println(greaterValue(3, 4))
}
