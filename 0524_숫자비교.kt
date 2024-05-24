class Solution {

    fun solution(num1: Int, num2: Int): Int {
        var n1 = num1
        var n2 = num2
        var answer: Int = 0

        if (n1==n2){
            answer = 1
        } else answer = -1
        
        println("num1이 $n1 이고 num2가 $n2 이므로 다릅니다. 따라서 $answer 을 return합니다.")

        return answer
    }
}

val solution = Solution()
val result = solution.solution(10,3)
println("결과 : $result")
