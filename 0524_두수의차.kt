class Solution {

    fun solution(num1: Int, num2: Int): Int {
        var n1 = num1
        var n2 = num2
        var answer: Int = 0
        answer = n1 - n2

        println("num1이 $n1 이고 num2가 $n2 이므로 $n1-$n2=$answer 을 return합니다.}")

        return answer
    }
}

val solution = Solution()
val result = solution.solution(2,3)
println("결과 : $result")
