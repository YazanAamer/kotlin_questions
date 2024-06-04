fun checkPalindrome(string: String): Boolean {
  for (i in 0..((string.length / 2) as Int - 1)) {if (string[i] != string[string.length-i-1]) {return false}}
  return true
}

fun numVowels(string: String): Int {
  var vowels = 0
  for (s in string) {if (s in "aeiouAEIOU") {vowels += 1}}
  return vowels
}

fun main() {
  println(checkPalindrome("abcba"))
  println(checkPalindrome("abccba"))
  println(numVowels("The quick brown fox jumps over the lazy dog"))
}

