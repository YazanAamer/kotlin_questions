fun main() {
  val a = -311
  when (if (a > 0) 1 else if (a < 0) -1 else 0) {
      0 -> println("zero")
      1 -> println("positive")
      -1 -> println("negative")
  }
  val b = 4
  when (b) {
      1 -> println("Sunday")
      2 -> println("Monday")
      3 -> println("Tuesday")
      4 -> println("Wednesday")
      5 -> println("Thursday")
      6 -> println("Friday")
      7 -> println("Saturday")
  }
}
