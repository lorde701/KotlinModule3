//Задание 12: Високосный год
//Напишите функцию, которая получает в параметры какой-либо год, проверяет високосный ли это год и возвращает результат проверки.

fun main(args: Array<String>) {
    println("Введите год")
    val year = try {
        readLine().toString().toInt()
    } catch (e: NumberFormatException) {
        println("Вы ввели не число")
        return
    }
    if (isLeapYear(year))
        println("$year - високосный год")
    else
        println("$year - обычный год")
}

fun isLeapYear(year: Int) = !((year % 4 != 0) || (year % 100 == 0) && (year % 400 != 0))
