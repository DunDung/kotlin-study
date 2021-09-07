package chapter07.use

import chapter07.util.Temperature as Singleton // 얼라이어스 사용
import chapter07.util.*

fun main() {
    println(unitsSupported())
    println(Singleton.add(3))
}