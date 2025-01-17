package `class`

import org.w3c.dom.css.Rect
import java.time.LocalDate

data class MutablePoint(var x: Int, var y: Int)

operator fun MutablePoint.set(index: Int, value: Int) {
    when (index) {
        0 -> x = value
        1 -> y = value
        else ->
            throw IndexOutOfBoundsException("非法索引")
    }
}

data class Rectangle(val upperLeft: Point, val lowerRight: Point)

operator fun Rectangle.contains(p : Point) : Boolean {
    return p.x in upperLeft.x until lowerRight.x &&
            p.y in upperLeft.y until lowerRight.y
}

operator fun ClosedRange<LocalDate>.iterator() : Iterator<LocalDate>  =
    object : Iterator<LocalDate> {
        var current = start

        override fun hasNext(): Boolean {
            return current <= endInclusive
        }

        override fun next() = current.apply {
            current = plusDays(1)
        }
    }

class Point6(val x: Int, val y: Int) {
    operator fun component1() = x
    operator fun component2() = y
}

data class NameComponents(val name: String,
                          val extension: String)

fun splitFilename(fullName: String) : NameComponents {
    val result = fullName.split('.', limit = 2)
    return NameComponents(result[0], result[1])
}

fun printEntries(map: Map<String, String>) {
    for((k, v) in map) {
        println("$k, $v")
    }
}
fun main() {
    val p = MutablePoint(10, 20)
    p[1] = 42
//    println(p)

    val rect = Rectangle(Point(10, 20), Point(50, 50))
//    println(Point(20, 30) in rect) // true
//    println(Point(5, 5) in rect) // true

    val newYear = LocalDate.ofYearDay(2017, 1)
    val daysOff = newYear.minusDays(1)..newYear

    for(dayOff in daysOff) {
        println(dayOff)
    }


    val p4 = Point(10, 20)
    val (x, y) = p4
    println("$x, $y")

    val (name, ext) = splitFilename("example.kt")
    println("$name, $ext")

    val map = mapOf("or" to "java", "jb" to "ko")
    printEntries(map)
}