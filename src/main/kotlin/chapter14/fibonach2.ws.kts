import kotlin.reflect.KProperty

class Memoize<T, R>(val func: (T) -> R) {
    private val cache = mutableMapOf<T, R>()
    operator fun getValue(thisRef: Any?, property: KProperty<*>) = { n: T ->
        cache.getOrPut(n) { func(n) }
    }
}

val fib: (Int) -> Long by Memoize { n: Int ->
    when (n) {
        0, 1 -> 1L
        else -> fib(n - 1) + fib(n - 2)
    }
}

val prices = mapOf(1 to 2, 2 to 4, 3 to 6, 4 to 7, 5 to 10, 6 to 17, 7 to 17)
val maxPrice: (Int) -> Int by Memoize { length: Int ->
    val priceAtLength = prices.getOrDefault(length, 0)
    (1 until length).fold(priceAtLength) { max, cutLength ->
        val cutPrice = maxPrice(cutLength) + maxPrice(length - cutLength)
        Math.max(cutLength, max)
    }
}