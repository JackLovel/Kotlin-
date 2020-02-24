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

fun printMessageWidthPrefix(message: Collection<String>, prefix: String) {
    message.forEach {
        println("$prefix $it")
    }
}

fun printProblemCounts(responses: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0
    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors++
        } else if (it.startsWith("5")) {
            serverErrors ++
        }
    }

    println("$clientErrors client errors, $serverErrors server errors")
}

fun Person.isAdult() = age >= 21

fun main() {
//    val people = listOf(Person("Alice", 12), Person("Bob", 13))
//    println(findTheOldest(people))

//    println(people.maxBy { p : Person -> p.age })
//
//    println(sum(1,2))
//
//    val errors = listOf("403 Forbidden", "404 Not Found")
//    printMessageWidthPrefix(errors,"Errors:")
//
//
//    val responses = listOf("200 OK", "418 I'm a teapot", "500 Internal server error")
//    printProblemCounts(responses)

//    val createPerson = ::Person
//    val p = createPerson("alice", 29)
//    println(p)
//
//    val predicate = Person::isAdult
//    println(predicate(p))
    val people = listOf(Person("Alice", 12), Person("Bob", 13))
    println(people.asSequence().map(Person::name).filter { it.startsWith("A") }.toList())
}