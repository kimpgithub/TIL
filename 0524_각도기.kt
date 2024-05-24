class Solution {

    fun solution(angle: Int): Int {
        var answer: Int = 0
        var text = ""

        if (angle in 1..89) {
            answer = 1
            text = "예각"
        } else if (angle == 90) {
            answer = 2
            text = "직각"
        } else if (angle in 91..179) {
            answer = 3
            text = "둔각"
        } else if (angle == 180) {
            answer = 4
            text = "평각"
        }

        println("angle이 $angle 이므로 $text 입니다. 따라서 $answer 을 return합니다.\n")
        return answer
    }
}

val solution = Solution()
val result = solution.solution(40)
println("결과 : $result")
