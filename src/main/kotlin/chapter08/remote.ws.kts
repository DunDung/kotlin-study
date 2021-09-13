package chapter08

interface Remote {
    fun up()
    fun down()
    fun doubleUp() {
        up()
        up()
    }

    companion object {
        fun combine(first: Remote, second: Remote): Remote = object : Remote {
            override fun up() {
                first.up()
                second.up()
            }

            override fun down() {
                first.down()
                second.down()
            }
        }
    }
}

class TV {
    private var volume = 0
    val remote: Remote
        get() = object: Remote {
            override fun up() { volume++; }
            override fun down() { volume-- }
            override fun toString() = "${this@TV.toString()}"
        }

    override fun toString() = "TV 볼륨: $volume"
}

val tv = TV()
val remote = TV().remote
println(tv.toString())
println(remote.toString())
