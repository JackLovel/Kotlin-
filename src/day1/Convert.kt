package day1

import java.lang.IllegalArgumentException

interface Expr
class Num(val value: Int) : Expr
class Sum(val left : Expr, val right : Expr) : Expr

fun eval(e : Expr) : Int {
    if (e is Num) {
        val n = e as Num
        return n.value
    }

    if (e is Sum) {
        return eval(e.right) + eval(e.left)
    }

    throw IllegalArgumentException("未知的表达式")
}

fun eval2(e : Expr) : Int =
    when (e) {
        is Num -> {
            e.value
        }
        is Sum -> {
            eval2(e.right) + eval2(e.left)
        }
        else -> {
            throw IllegalArgumentException("未知的表达式")
        }
    }



fun main() {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}