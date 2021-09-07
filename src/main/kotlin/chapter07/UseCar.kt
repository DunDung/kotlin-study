package chapter07

fun useCarObject(): Pair<Int, String> {
    val car = Car(2019, "RED")
    val year = car.yearOfMake
    car.color = "GREEN"
    val color = car.color
    return year to color
}

fun main() {
    val car = Car(2019, "RED")
    car.color = ""
}