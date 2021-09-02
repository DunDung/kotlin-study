// 객체 표현식으로 인터페이스 구현체 만들기
fun createRunnable(): Runnable {
    return object: Runnable {
        override fun run() { println("run") }
    }
}

createRunnable().run()

// 싱글 추상 메소드 인터페이스(자바에선 함수형 인터페이스)는 이렇게도 가능
fun createRunnable2(): Runnable = Runnable { println("run") }
createRunnable2().run()

// 둘 이상의 인터페이스 구현 -> 리턴 타입을 꼭 명시해줘야한다.
fun createRunnable3(): Runnable = object: Runnable, AutoCloseable {
    override fun run() { println("run") }
    override fun close() { println("close") }
}
createRunnable3().run()
//createRunnable3().close() // 당연 ERROR

object Util {
    fun numberOfProcessors() = Runtime.getRuntime().availableProcessors()
}
println(Util.numberOfProcessors())