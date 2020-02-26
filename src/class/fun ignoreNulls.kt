package `class`

fun ignoreNulls(s: String?) {
    val sNotNull: String = s!!
    println(sNotNull.length)
}


fun sendEmailTo(email: String) {
    println("Sending email to $email")
}

fun verifyUserInput(input: String?) {
    if (input.isNullOrBlank()) {
        println("please fill in the require fields")
    }
}

fun String?.isNullOrBlank() : Boolean =
    this == null || this.isBlank()

data class Person4(val name: String, val age: Int? = null) {
    fun isOlderThan(other: Person4) : Boolean? {
        val o = other
        if(age == null || o.age == null) {
            return null
        }

        return age > o.age
    }
}
fun main() {
//    ignoreNulls(null)
//    var email: String? = "gog@qq.com"
//    email?.let { sendEmailTo(it) }
//
//    email = null
//    email?.let { sendEmailTo(it) }
//    verifyUserInput(" ")
//    verifyUserInput(null)
    println(Person4("Sam", 35).isOlderThan(Person4("Am", 42)))
    println(Person4("Sam", 35).isOlderThan(Person4("Jane")))
}