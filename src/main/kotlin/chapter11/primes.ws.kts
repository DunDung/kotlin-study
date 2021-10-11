package chapter11

fun isPrime(n: Long) = n > 1 && (2 until n).none { i -> n % i == 0L }
// tailrac은 ch14 꼬리호출 최적화에서 다룸
tailrec fun nextPrime(n: Long): Long = if (isPrime(n + 1)) n + 1 else nextPrime(n + 1)

val primes = generateSequence(5, ::nextPrime)
print(primes.take(6).toList())    // [5, 7, 11, 13, 17, 19]

val primes2 = sequence {
    var i: Long = 0
    while (true) {
        i++
        if (isPrime(i)) {
            yield(i)
        }
    }
}
println(primes2.drop(2).take(6).toList())