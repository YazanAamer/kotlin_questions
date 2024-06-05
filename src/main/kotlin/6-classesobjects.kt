class Person(val name: String, val age: Int) {
    fun printDetails() = println("$name, aged $age")
}

data class Book(val title: String, val author: String, val year: Int)

/* 
/// Defining functions within other functions is generally not recommended in Kotlin. 
/// For single operations, you can use top-level functions or define them within a class.
/// For more complex operations, consider using classes or extensions.
*/

fun main() {
    val person1 = Person("Mike", 30)
    person1.printDetails()

    val books: List<Book> = listOf(
        Book("A New Earth", "Ekhart Tolle", 2005),
        Book("Flowers for Algernon", "Daniel Keyes", 1958),
        Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 1979)
    )
    printBooks(books)
}

fun printBooks(books: List<Book>) {
    for (book in books) println(book)
}
