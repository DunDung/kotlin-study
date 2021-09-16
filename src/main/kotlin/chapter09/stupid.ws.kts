import kotlin.reflect.KProperty

var comment = "This is Stupid"
println(comment) // This is stupid

class PoliteString(var content: String) {
    operator fun getValue(thisRef: Any?, property: KProperty<*>) =
        content.replace("stupid", "s*****")
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        content = value
    }
}

var comment2: String by PoliteString("some message")
println(comment2) // some message
comment2 = "This is stupid"
println(comment2) // This is s*****
