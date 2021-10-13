
operator fun Pair<Int, Int>.plus(other: Pair<Int, Int>) =
    Pair(first + other.first, second + other.second)

val pair = Pair(1, 1)
val pair2 = Pair(2, 2)
pair + pair2

class Count(private val value: Int) {
    operator fun inc() = Count(value + 1)
    override fun toString() = "$value"
}
var count = Count(1)
println(count.hashCode())
println(count++)
println(count.hashCode())
println(count++)
println(count.hashCode())
