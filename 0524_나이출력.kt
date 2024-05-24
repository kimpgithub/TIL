class Solution {

    fun solution(age: Int): Int {

        var teacherAge = age
        var answer: Int = 0

        answer = 2023-teacherAge

        println("2022년 기준 $teacherAge 살이므로 $answer 년생입니다.\n")

        return answer
    }
}

val solution = Solution()
val result = solution.solution(40)
println("결과 : $result")
