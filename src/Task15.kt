//Задание 15: Лямбда
//Создайте переменную, которая содержит лямбда выражение для вывода в консоль данных массива типа String.

fun main(args: Array<String>) {
    val lambda = { array: Array<String> -> array.forEach { println(it) } }
    lambda(arrayOf("Привет", "Как дела?"))
}