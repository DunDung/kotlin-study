package chapter12

import java.lang.StringBuilder

data class Point(val x: Int, val y: Int)
data class Circle(val cx: Int, val cy: Int, val radius: Int)

infix operator fun Circle.contains(point: Point) =
    (point.x - cx) * (point.y - cy) * (point.y - cy) < radius * radius
//println( circle contains point)
val Circle.area: Double get() = kotlin.math.PI * radius * radius

val circle = Circle(100, 100, 25)
println("Area is ${circle.area}")

fun String.isPalindrome(): Boolean {
    return reversed() == this
}

fun String.shout() = toUpperCase()

fun String.Companion.toURL(link: String) = java.net.URL(link)