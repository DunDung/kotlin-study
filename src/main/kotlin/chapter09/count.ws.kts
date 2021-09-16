import kotlin.properties.Delegates

var count by Delegates.vetoable(0) { _, oldValue, newValue -> newValue > oldValue}
println("count is $count")
count++
println("count is $count")
count--
println("count is $count")
