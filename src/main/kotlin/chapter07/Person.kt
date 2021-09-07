package chapter07

class Person(val first: String = "junseong", val last: String = "hong") {
    var fullTime = true
    var location: String = "-"

    constructor(first: String, last: String, fte: Boolean) : this(first, last) {
        fullTime = fte;
    }
    constructor(first: String, last: String, loc: String) : this(first, last, false) {
        location = loc
    }

    override fun toString() = "$first $last $fullTime $location"
}

inline class SSN(val id: String)
fun receiveSSN(ssn: SSN) {
    println("$ssn")
}

fun main() {
    val ssn = SSN("1")
    receiveSSN(ssn)
}