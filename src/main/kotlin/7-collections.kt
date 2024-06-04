fun max(intList: List<Int>): Int {
  var currMax: Int = intList[0]
  for (i in intList) {if (i > currMax) {currMax = i}}
  return currMax
}

fun main() {
  val list: List<Int> = listOf(74, 37, 62, 27, 83, 92, 13, 18, 41, 27)
  println(max(list))
}
