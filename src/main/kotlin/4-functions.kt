val add = {a: Int, b: Int -> a + b}

fun map(list: List<Any>, func: (input: Any) -> Any): MutableList<Any> {
  var newList = mutableListOf<Any>()
  for (i in list) newList.add(func(i))
  return newList
}

fun main() {
  println(add(1, 2))
  println(map(listOf(1, 2, 3), {it: Any -> (it as Int) * 2}))
}
