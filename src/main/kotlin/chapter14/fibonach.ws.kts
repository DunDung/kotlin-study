package chapter14

fun fib1(n: Int): Long = when (n) {
    0, 1 -> 1L
    else -> fib1(n - 1) + fib1(n - 2)
}

fun <T, R> ((T) -> R).memoize(): ((T) -> R) {
    val original = this
    val cache = mutableMapOf<T, R>()
    return { n: T -> cache.getOrPut(n) { original(n) } }
}

lateinit var fib: (Int) -> Long
fib = { n: Int ->
    when (n) {
        0, 1 -> 1L
        else -> fib(n - 1) + fib(n - 2)
    }
}.memoize()

println(fib(500))