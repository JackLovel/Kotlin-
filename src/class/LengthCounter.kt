package `class`

class LengthCounter {
    var counter: Int = 0
        private set // 不能在内外面进行修改

    fun addWord(word: String) {
        counter += word.length
    }
}

fun main() {
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi!")
    println(lengthCounter.counter)
}