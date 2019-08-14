//Задание 16: Корень числа
//Добавьте функцию для переменных типа Double, возвращающую корень числа

fun main(args: Array<String>) {
    val d = 144.0
    println(d.root())
}

fun Double.root(): Double {
    return Math.sqrt(this)
}