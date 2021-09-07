data class Task(val id: Int, val name: String)
val task1 = Task(1, "일기쓰기")
val task2 = task1.copy(id = 2)
println(task1)
println(task2)

val (id, name) = task1
println(id)
println(name)