package lambda.`class`

data class Person8(val name: String, val age:Int)

val people = listOf(Person8("Alice", 29), Person8("Bob", 31))

fun lookForAlice(p : List<Person8>) {
    for (p in people) {
        if (p.name == "Alice") {
            println("找到了")
            return
        }
    }

    println("没有找到")
}

// 使用 forEach 进行改写
fun lookForAlice2(p : List<Person8>) {
    p.forEach {
        if (it.name == "Alice") {
            println("找到了")
            return
        }
    }

    println("没有找到")
}

fun lookForAlice3(p : List<Person8>) {
    p.forEach label@{
        if (it.name == "Alice") {
            return@label
        }
    }

    println("Alice might be somewhere")
}

fun main() {
//    lookForAlice(people)
    lookForAlice2(people)
    lookForAlice3(people)
}