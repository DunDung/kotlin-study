package chapter12

val length = 100
val printIt: String.(Int) -> Unit = {
    n: Int -> println("n: $n, length: $length")
}
printIt("Hello", 5)
"Hello".printIt(5) // 람다를 리시버의 멤버 함수처럼 사용하기

fun top(func: String.() -> Unit) = "hello".func()
fun nested(func: Int.() -> Unit) = (-2).func()
top {
    println("hello 리시버 사용 $this and $length")
    nested {
        println("Int -2를 리시버로 사용 $this and ${toDouble()}")
        println("부모 리시버로 라우팅 $length")
        println("부모 리시버 접근 ${this@top}")
    }
}