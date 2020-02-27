package `class`

/**
 * 运算符重载
 * **/
data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        val o: Point = other
        return Point(x + o.x, y + o.y)
    }

    operator fun times(scale: Double) : Point {
        return Point((x * scale).toInt(), (y * scale).toInt())
    }
}


operator fun Char.times(count: Int) : String {
    return toString().repeat(count)
}

operator fun Point.get(index: Int) : Int {
    return when(index) {
        0 -> x
        1 -> y
        else -> throw IndexOutOfBoundsException("非法索引")
    }
}
class Point2(val x: Int, val y: Int) {
    override fun equals(o: Any?): Boolean {
        if (o === this) return true
        if (o !is Point2) return false
        return o.x == x && o.y == y
    }
}

// 实现 comparable 接口
class Person7(val firstName: String, val lastName: String) : Comparable<Person7> {
    override fun compareTo(o: Person7): Int {
        return compareValuesBy(this, o, Person7::lastName, Person7::firstName)
    }
}
fun main() {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
//    println(p1 + p2)
//    println(p1 * 1.5)
//    println('a'*45)

    println(Point2(10, 20) == Point2(10, 20)) // true

    val p3 = Person7("Alice", "Smith")
    val p4 = Person7("Bob", "Johnson")
    println(p3 < p4) // false
    println("a" < "b") // true

    val p = Point(10, 20)
    println(p1[0])
}