package lambda

data class Person(val name: String, val age: Int)

fun findTheOldest(people : List<Person>) : Person? {
    var maxAge = 0
    var theOldest : Person? = null
    for (person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }
    }

    return theOldest
}

val sum = {x:Int, y:Int -> x + y }
fun main() {
    val people = listOf(Person("Alice", 12), Person("Bob", 13))
//    println(findTheOldest(people))

    println(people.maxBy { p : Person -> p.age })

    println(sum(1,2))
}