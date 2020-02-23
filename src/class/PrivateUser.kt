package `class`

/**
 * 自定义 getter 或者 setter 访问字段
 * */
class User(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println("""
                Address was changed for $name
                "$field" -> "$value".
            """.trimIndent())

            field = value // 更新支持的字段的值
        }
}

fun main() {
    val user = User("Alice")
    user.address = "JackLovel"
}