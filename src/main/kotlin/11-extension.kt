fun String.reverse(): String {
  var newStr = "" 
  for (i in 0..(this.length-1)) {
    val j = this.length-i-1
    newStr = "${newStr}${this[j]}"
  }
  return newStr
}

fun main() {
  println("abc".reverse())
}
