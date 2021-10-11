package chapter11

val numbers = listOf(10, 12, 14, 17, 18, 19)

fun isEven(num: Int): Boolean {
    println("enter isEven $num")
    return num % 2 == 0
}
fun makeDouble(num: Int): Int {
    println("enter makeDouble $num")
    return num * 2
}
val doubled = numbers
//    .asSequence()
    .filter(::isEven)
    .map(::makeDouble)
    .first()

println(doubled)
