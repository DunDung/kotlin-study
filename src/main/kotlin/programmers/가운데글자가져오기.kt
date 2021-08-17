package programmers

//21-08-17
class 가운데글자가져오기 {

    fun solution(s: String): String {
        val index = s.length / 2
        return if (s.length % 2 != 0) {
            s.substring(index, index + 1)
        } else s.substring(index - 1, index)
    }
}