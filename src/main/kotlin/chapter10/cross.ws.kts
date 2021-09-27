package chapter10

inline fun invokeCross(
    n: Int,
    action1: (Int) -> Unit,
    action2: (Int) -> Unit
)
//: (Int) -> Unit
{
    action1(n)
//    return { input: Int -> action2(input) }    // ERROR
}