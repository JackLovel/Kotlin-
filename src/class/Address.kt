package `class`

import java.lang.IllegalArgumentException

class Address(val streetAddress: String, val zipCode : Int,
              val city: String, val country: String)

class Company(val name: String, val address: Address?)

class Person(val name: String, val company: Company?)

fun Person.countryName() : String {
    val country = this.company?.address?.country
    return country ?:  "未知" // p143
}

fun printShippingLabel(person: Person) {
    val address = person.company?.address
        ?: throw IllegalArgumentException("没有地址")
    with(address) {
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}

fun foo(s: String) {
    val t: String = s?: ""
}

fun strLenSafe2(s: String?) : Int = s?.length ?: 0
fun main() {
    val person = Person("Dmitry", null)
    println(person.countryName())
    println(strLenSafe2("abc"))
    println(strLenSafe2(null))



    val address = Address("El", 80, "mu", "Germany")
    val jetbrains = Company("jetbrains", address)
    val person2 = Person("dm", jetbrains)
    printShippingLabel(person2)
//    printShippingLabel(Person("Alexey", null))
}