package chapter10

val names = listOf("js", "ha")
findName(names, "js")

fun findName(names: List<String>, target: String): Boolean {
    for (name in names) {
        if (name == target) {
            return true
        }
    }
    return false
}

val doubleOfEven = (1..10)
    .filter { e -> e % 2 == 0 }
    .map { e -> e * 2 }

println(doubleOfEven);

fun isPrime(n: Int) = n > 1 && (2 until n).none { i -> n % i == 0 }
println(isPrime(5))

fun isPrime2(n: Int) = n > 1 && (2 until n).none { n % it == 0 }
println(isPrime(5))

fun walk1To(action: (Int) -> Unit, n: Int) = (1..n).forEach{ action(it) }
walk1To({ print(it) }, 5)

fun walk1To2(n: Int, action: (Int) -> Unit) = (1..n).forEach{ action(it) }
walk1To2(5) { print(it) }

fun walk1To3(n: Int, action: (Int) -> Unit) = (1..n).forEach(action)
walk1To2(5, ::print)