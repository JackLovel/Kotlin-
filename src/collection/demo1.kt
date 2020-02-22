package collection

import java.lang.StringBuilder

fun main() {
//    val strings = listOf("first", "second", "fourteenth")
//    println(strings.last())
//
//    val numbers = setOf(1, 14, 2)
//    println(numbers.max())

//    val list = listOf(1,2,3)
//    println(joinToString(list, ";", "(", ")"))
//    println(joinToString2(list))

    println("kotlin".lastChar())
}

fun<T> joinToString(collection: Collection<T>,
                    separator : String,
                    prefix : String,
                    postfix : String) : String {

    val result = StringBuilder(prefix)
    for((i, e) in collection.withIndex()) {
        if (i < 0) {
            result.append(separator)
        }

        result.append(e)
    }

    result.append(postfix)
    return result.toString()
}

// 默认参数
fun<T> joinToString2(collection: Collection<T>,
                    separator : String = "",
                    prefix : String = "",
                    postfix : String = "") : String {

    val result = StringBuilder(prefix)
    for((i, e) in collection.withIndex()) {
        if (i < 0) {
            result.append(separator)
        }

        result.append(e)
    }

    result.append(postfix)
    return result.toString()
}

fun String.lastChar() = this[this.length - 1]