//Задание 13: Количество сотрудников
//Напишите функцию, принимающую на вход имена сотрудников и возвращающую их количество.
// Используйте для этого vararg, из предыдущей темы.

fun main(args: Array<String>) {
    val employees = arrayOf("Первый", "Второй", "Третий", "Четвертый", "Пятый", "Шестой")
    println("Список сотрудников:")
    employees.forEach { println(it) }
    println("\nКоличество сотрудников: " + numberEmployees(*employees))
}

fun numberEmployees(vararg employees: String) = employees.size