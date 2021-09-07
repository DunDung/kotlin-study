class Machine(val name: String) {
    fun checkIn() = checkedIn++
    fun checkOut() = checkedIn--
    companion object MachineFactory {
        var checkedIn = 0
        fun minimumBreak() = "15 minutes"
        fun withName(name: String): Machine {
            return Machine(name)
        }
    }
}

Machine("Mater").checkIn()
println(Machine.minimumBreak())
println(Machine.checkedIn)