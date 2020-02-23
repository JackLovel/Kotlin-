package `class`

open class RichButton : Clickable {
    fun disable() {} // 不可被继承
    override fun click() { // 默认是 final, 不可以被继承
    }

    open fun animate() { // 可以被继承
    }
}

fun main() {

}