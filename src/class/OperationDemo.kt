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

fun main() {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1 + p2)
    println(p1 * 1.5)
    println('a'*45)
}