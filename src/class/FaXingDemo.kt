package lambda.`class`

import java.lang.Appendable
import java.lang.IllegalArgumentException

fun <T: Comparable<T>> max(first: T, second: T): T {
    return if (first > second) first else second
}

fun <T> ensureTrailingPeriod(seq: T) where T : CharSequence, T : Appendable {
    if (!seq.endsWith('.')) {
        seq.append('.')
    }
}

class Processor<T> {
    fun process(value: T) {
        value?.hashCode()
    }
}

fun printSum(c: Collection<*>) {
    val intList = c as? List<Int>
        ?: throw IllegalArgumentException("list is expected")
    println(intList.sum())
}

fun printSum2(c: Collection<Int>) {
    if (c is List<Int>) {
        println(c.sum())
    }
}

fun main() {
    println(max("kotlin", "java"))

    val helloWorld = StringBuilder("Hello World!")
    ensureTrailingPeriod(helloWorld)
    println(helloWorld)

    val nullableStringProcessor = Processor<String?>()
    nullableStringProcessor.process(null)

    printSum(listOf(1,2,3))
//    printSum(setOf(1,2,3))
//    printSum(listOf("a","b","c"))

    printSum2(listOf(1,2,3))
}

