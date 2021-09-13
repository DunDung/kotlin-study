package chapter08

abstract class Animal(val name: String) {
    abstract fun bark(): String
}
class Dog(name: String) : Animal(name) {
    override fun bark() = "$name: 멍멍!"
}
