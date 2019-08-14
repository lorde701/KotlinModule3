//Задание 14: Инфо сотрудника
//Напишите функцию, которая выводит в консоль информацию сотрудника (ФИО, Возраст, Должность и Семейное положение). С помощью перезагрузки функции, сделайте варианты, когда известны только:
//- ФИО и Должность
//- ФИО, Возраст и Должность
//- ФИО, Семейное положение и Должность
//- ФИО, Возраст, Семейное положение и Должность

fun main(args: Array<String>) {
    printData("Петров Петр", 35, "Инженер", "не женат")
    println()
    printData("Петров Петр", 35, "Инженер")
    println()
    printData("Петров Петр", "не женат", "Инженер")
    println()
    printData("Петров Петр", "Инженер")
}

fun printData(fio: String, age: Int, position: String, familyStatus: String) = println("""ФИО - $fio
    |Возраст - $age
    |Должность - $position
    |Семейное положение - $familyStatus
""".trimMargin())

fun printData(fio: String, position: String) = println("""ФИО - $fio
    |Должность - $position
""".trimMargin())

fun printData(fio: String, age: Int, position: String)= println("""ФИО - $fio
    |Возраст - $age
    |Должность - $position
""".trimMargin())

fun printData(fio: String, familyStatus: String, position: String) = println("""ФИО - $fio
    |Должность - $position
    |Семейное положение - $familyStatus
""".trimMargin())