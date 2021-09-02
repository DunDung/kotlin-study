fun greet() = "hello"
fun greet2(): String = "hello2"
listOf(1, 2);
println(greet())
println(greet2())

println(Array(5) {
    i -> (i + 1) * (i + 1)
}.sum())