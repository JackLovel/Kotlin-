package `class`

interface Focusable {
    fun setFocus(b : Boolean) {
        println("I ${if (b) "get" else "lost"} focus")
    }

    fun showOff() {
        println("I'm focusable")
    }
}
