package `class`

class Client(val name: String, val postalCode: Int) {

    // 重写 equals 方法
    override fun equals(o: Any?): Boolean {
        if (o == null || o !is Client) {
            return false
        }

        return (name == o.name) && (postalCode == o.postalCode)
    }

    override fun toString(): String {
        return "Client (name=$name, postalCode=$postalCode)"
    }

    override fun hashCode(): Int = name.hashCode() * 31 + postalCode
}

fun main() {
    val client1 = Client("Alice", 23213)
    val client2 = Client("Alice", 23213)
    println(client1 == client2) // true

    // hashCode
    val processed = hashSetOf(Client("Alice", 123))
    println(processed.contains(Client("Alice", 123))) // true
}