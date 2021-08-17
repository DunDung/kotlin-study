package programmers

//21-08-17
class 숫자문자열과영단어 {

    fun solution(s: String): Int {
        val words = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
        var answer = s;
        words.indices
            .asSequence()
            .filter { s.contains(words[it]) }
            .forEach { answer = answer.replace(words[it], it.toString()) }
        return Integer.parseInt(answer);
    }
}