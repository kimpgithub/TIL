//class Solution {
//
//    fun solution(num1: Int, num2: Int): Int {
//        var n1 = num1
//        var n2 = num2
//        var answer: Int = 0
//        var preanswer : Double = 0.0
//        preanswer = n1.toDouble() / n2
//        answer = (preanswer*1000).toInt()
//
//        println("num1이 $n1, num2가 $n2 이므로 $n1 / $n2 = $preanswer 에 1,000을 곱하면 $answer 이 됩니다.\n")
//
//        return answer
//    }
//}
//
//val solution = Solution()
//val result = solution.solution(7,3)
//println("결과 : $result")

class Solution {

    fun solution(num1: Int, num2: Int): Int {
        val result = (num1.toDouble() / num2 * 1000).toInt()

        println("num1이 $num1, num2가 $num2 이므로 $num1 / $num2 = ${num1.toDouble() / num2}에 1,000을 곱하면 $result 이 됩니다.\n")

        return result
    }
}

val solution = Solution()
val result = solution.solution(7, 3)
println("결과: $result")
