package chapter10

fun invoke(n: Int, action: (Int) -> Unit) {
    println("enter invoke $n")
    action(n)
    println("exit invoke $n")
}

fun caller() {
    (1..3).forEach { i ->
        println("in forEach for $i")
        if (i == 2) {
            return
        }
        invoke(i) {
            println("enter for $it")
            if (i == 2) {
                return@invoke
            }
            println("exit for $it")
        }
    }
    println("end caller")
}
caller()
println("after return from caller")

inline fun invoke(
    n: Int,
    action1: (Int) -> Unit,
    noinline action2: (Int) -> Unit
): (Int) -> Unit {
    action1(n)
    action2(n)
    return { input: Int -> action2(input) }
}


fun callInvoke() {
    invoke(1, { i ->
        if (i == 1) {
            return
        }
    }, { i ->
        if (i == 2) {
//            return    // ERROR
        }
    })
}