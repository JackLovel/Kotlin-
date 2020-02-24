package `class`

data class Book (val title: String, val authors: List<String>)



fun main() {
    val books = listOf(Book("1", listOf("ja", "pf")),
        Book("2", listOf("za", "sf")))
    println(books.flatMap { it.authors }.toList())
}

