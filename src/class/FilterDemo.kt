package `class`

import lambda.Person

fun main() {
    // filter demo
//    val list = listOf(1,2,3,4)
//    println(list.filter { it % 2 == 0 })


    val people = listOf(Person("Alice", 33), Person("Bob", 32))
//    println(people.filter { it.age > 30 })

    // map demo
//    println(list.map{it * it})
//
//    println(people.map { it.name })
//    println(people.map(Person::name))

//    println(people.filter { it.age > 30}.map { it.name })
//    println(people.maxBy { it.age }?.age)
    val maxAge = people.maxBy { it.age }!!.age
    println(people.filter { it -> it.age == maxAge})

    val numbers = mapOf(0 to "zero", 1 to "One")
    println(numbers.mapValues { it.value.toUpperCase() })

    val canBeInClub27 = { p : Person -> p.age <= 27 }
//    println(canBeInClub27)
    val people3 = listOf(Person("Alice", 27), Person("Bob", 30))
    println(people3.all(canBeInClub27)) // false
    println(people3.any(canBeInClub27)) // true

    val list = listOf(1,2,3)
    println(!list.all { it == 3 })
    println(list.any {it != 3 })

    val people4 = listOf(Person("Alice", 27), Person("Bob", 31), Person("z", 31))
    println(people4.count(canBeInClub27))
    println(people4.groupBy { it.age })

    val list2 = listOf("a", "ab", "b")
    println(list2.groupBy { it.first() })
}