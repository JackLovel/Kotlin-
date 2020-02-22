package day1;

import java.lang.StringBuilder

var StringBuilder.lastChar : Char
    get() = get(length - 1)
    set(value : Char) {
        this.setCharAt(length - 1, value)
    }

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

class User(val id : Int, val name : String, val address : String)

fun saveUser(user: User) {
//    if (user.name.isEmpty()) {
//        throw IllegalArgumentException("Can't save user ${user.id}: empty Name")
//    }
//
//    if (user.address.isEmpty()) {
//        throw IllegalArgumentException("Can't save user ${user.address}: empty Address")
//    }
}

fun validate(user: User,
             value: String,
             fieldName : String) {
    if (value.isEmpty()) {
        if (user.address.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.address}: empty Address")
        }
    }
}
fun main() {
//    val view: View = Button()
//    view.click()
//    view.showOff()

//    val (number, name) = 1 to "one"
//
//    val sb = StringBuilder("Kotlin?")
//    sb.lastChar = '!'
//    println(sb)
//    println("12.345-6.A".split("\\.|-".toRegex()))
//    saveUser(User(1, "",""))

    var user: User = User(1,"wcc", "sss")
    saveUser(user)
}