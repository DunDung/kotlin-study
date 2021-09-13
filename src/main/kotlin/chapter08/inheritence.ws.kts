package chapter08

import java.lang.RuntimeException

open class Vehicle(val year: Int, open var color: String) {
    open val km = 0
    final override fun toString() = "$year $color"
    fun repaint(newColor: String) {
        color = newColor
    }
}

open class Car(year: Int, color: String) : Vehicle(year, color) {
    override var km: Int = 0
        set(value) = if (value < 1) throw RuntimeException() else field = value
    fun drive(distance: Int) {
        km += distance
    }
}