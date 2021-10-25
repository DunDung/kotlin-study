package chapter13

import chapter13.DateUtil.Tense.*
import java.util.*

infix fun Int.days(timing: DateUtil.Tense) = DateUtil(this, timing)

class DateUtil(private val number: Int, private val tense: Tense) {
    enum class Tense {
        AGO, FROM_NOW
    }

    override fun toString(): String {
        val today = Calendar.getInstance()
        when (tense) {
            AGO -> today.add(Calendar.DAY_OF_MONTH, -number)
            FROM_NOW -> today.add(Calendar.DAY_OF_MONTH, number)
        }
        return today.time.toString()
    }
}