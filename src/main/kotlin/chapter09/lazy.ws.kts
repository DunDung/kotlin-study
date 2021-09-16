
fun getTemperature(city: String) : Double {
    println("this $city")
    return 30.0
}
val city = "seoul"
var isShow = false
val temperature by lazy { getTemperature(city) }
if (isShow && temperature > 20) println("warm") else println("cold")

