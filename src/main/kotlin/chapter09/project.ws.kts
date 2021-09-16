package chapter09

interface Worker {
    fun work()
}
class JavaProgrammer() : Worker {
    override fun work() {
        println("java work")
    }
}
class CProgrammer() : Worker {
    override fun work() {
        println("C work")
    }
}
class Manager(var staff: Worker) : Worker by staff {
}
val manager = Manager(JavaProgrammer())
manager.work()
manager.staff = CProgrammer()
manager.work()