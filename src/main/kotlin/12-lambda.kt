fun filterShorter(list: List<String>, length: Int): List<String> = list.filter {it.length < length}

fun main () {
  println(filterShorter(listOf("h", "he", "hel", "hell", "hello", "hellow", "hellowo", "hellowor", "helloworl", "helloworld"), 5))
}
