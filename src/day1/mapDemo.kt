package day1

import java.util.*

fun isLetter(c : Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'

fun main() {
    // map demo
//    val bindaryReps = TreeMap<Char, String>()
//    for (c in 'A'..'F') {
//        val binary = Integer.toBinaryString(c.toInt())
//        bindaryReps[c] = binary
//    }
//
//    for ((letter, binary) in bindaryReps) {
//        println("$letter, $binary")
//    }


//    val list = arrayListOf("10", "11", "1001")
//    for ((i, e) in list.withIndex()) {
//        println(("$i, $e"))
//    }

    println(isLetter('1'))
    println(isNotDigit('X'))
    println("Kotlin" in setOf("Java", "Scala"))
}
