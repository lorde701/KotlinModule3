//Задание 12: Високосный год
//Напишите функцию, которая получает в параметры какой-либо год, проверяет високосный ли это год и возвращает результат проверки.

fun main(args: Array<String>) {
    println("Введите год")
    try {
        val year = readLine().toString().toInt()
        if (isLeapYear(year))
            println("$year - високосный год")
        else
            println("$year - обычный год")
    } catch (e: NumberFormatException) {
        println("Вы ввели не число")
    }
}

fun isLeapYear(year: Int): Boolean {
    return !((year % 4 != 0) || (year % 100 == 0) and (year % 400 != 0))
}
