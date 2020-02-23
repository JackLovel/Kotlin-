package `class`

//data class Client1(val name: String, val postalCode: Int)

class Client1(val name: String, val postalCode: Int) {
    fun copy(name:String = this.name, postalCode: Int = this.postalCode) = Client1(name, postalCode)
}

fun main() {
    val bob = Client1("Bob", 12)
    println(bob.copy(postalCode = 13))
}