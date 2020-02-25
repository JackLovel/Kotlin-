package `class`

class Person2(val firstName: String, val lastName: String) {
    override fun equals(o: Any?): Boolean {
        val otherPerson = o as? Person2 ?: return false

        return otherPerson.firstName == firstName &&
                otherPerson.lastName == lastName
    }

    override fun hashCode(): Int {
        return firstName.hashCode() * 37 + lastName.hashCode()
    }
}


fun main() {
    val p1 = Person2("dm", "je")
    val p2 = Person2("dm", "je")
    println(p1 == p2)
    println(p1.equals(p2))
}