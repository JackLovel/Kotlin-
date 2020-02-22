package day1;

open class View {
    open fun click() = println("view click")
}

class Button : View() {
    override fun click() {
        println("button click")
    }
}

fun View.showOff() = println("我是View")
fun Button.showOff() = println("我是Button")
fun main() {
    val view: View = Button()
    view.click()
    view.showOff()
}