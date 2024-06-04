fun generateFibonacci (f: Int): MutableList<Int> {
  if (f == 0) {return mutableListOf(0)}
  if (f == 1) {return mutableListOf(0, 1)}
  var currList = mutableListOf(0, 1)
  for (i in 1..(f-2)) {currList.add(currList[i] + currList[i-1])} 
  return currList
}

fun generateMultiplicationTable(n: Int, nMax: Int): Unit {
  for (i in 1..nMax) {println("$n * $i = ${n * i}")}
}

fun main() {
  println(generateFibonacci(10))
  generateMultiplicationTable(6, 12)
}
