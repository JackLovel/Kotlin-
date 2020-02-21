package day1

enum class Color(var r: Int, var g: Int, var b: Int) {
    RED(255, 0, 0), ORANGE(255, 165, 0), YELLOW(255, 255, 0),
    GREEN(0, 0, 255), INDIGO(75, 0, 130), VIOLET(238, 130, 238),
    BLUE(0, 0, 255);

    fun rgb(): Int {
        return (r * 256 + g) * 256 + b
    }
}