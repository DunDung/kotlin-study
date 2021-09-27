package chapter10

val names = listOf("pam", "paul", "paula")
println(names.find { name -> name.length == 4 })
println(names.find { name -> name.length == 5 })

fun predicate(length: Int): (String) -> Boolean {
    return { input: String -> input.length == length }
}

fun predicate2(length: Int) = { input: String -> input.length == length }

println(names.find(predicate(4)))
println(names.find(predicate(5)))

val checkLength5 = { input: String -> input.length == 5 }
println(names.find(checkLength5))

val checkLength52: (String) -> Boolean = { input -> input.length == 5 }

val checkLength53 = fun(name: String): Boolean { return name.length == 5 }

names.find(fun(name: String): Boolean { return name.length == 5 })

val factor = 2
val doubleIt = { e: Int -> e * factor }