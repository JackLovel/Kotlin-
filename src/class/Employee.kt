package `class`

class Employee(val name: String, val manager: Employee?)

fun managerName(employee: Employee) : String? {
    return employee.manager?.name
}

fun main() {
    val ceo = Employee("Da Boss", null)
    val developer = Employee("Bob Smith", ceo)

    println(managerName(developer))
    println(managerName(ceo))
}