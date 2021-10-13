
class Point(x: Int, y: Int) {
    private val pair = Pair(x, y)
    private val firstSign = if (pair.first < 0) "" else "+"
    private val secondSign = if (pair.second < 0) "" else "+"
    override fun toString() = pair.pointToString()
    fun Pair<Int, Int>.pointToString() =
        "(${firstSign}${first}, ${this@Point.secondSign}${this.second}"
}

fun <T, R, U> ((T) -> R).andThen(next: (R) -> U): (T) -> U =
    { input: T -> next(this(input))}