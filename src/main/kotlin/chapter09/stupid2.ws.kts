import kotlin.reflect.KProperty

class PoliteString(val dataSource: MutableMap<String, Any>) {
    operator fun getValue(thisRef: Any?, property: KProperty<*>) =
        (dataSource[property.name] as? String)?.replace("stupid", "s*****") ?: ""

    operator fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        dataSource[property.name] = value
    }
}

class PostComment(dataSource: MutableMap<String, Any>) {
    val title: String by dataSource
    var likes: Int by dataSource
    val comment: String by PoliteString(dataSource)
    override fun toString() = "Title: $title Like: $likes Comment: $comment"
}


val postComment = PostComment(
    mutableMapOf(
        "title" to "Using Delegation",
        "likes" to 1,
        "comment" to "stupid"
    )
)
postComment.likes++
println(postComment.toString())