//class Solution {
//
//    fun solution(n: Int, k: Int): Int {
//        var number = n
//        val kNumber = k
//        val service = n/10
//        var answer: Int = 0
//        answer = 12000*number + 2000*(kNumber-service)
//
//
//        println("$n 인분을 시켜 서비스로 음료수를 $service 개 받아 총 $n * 12000 + $k * 2000 - $service * 2000 = $answer 원입니다.")
//
//        return answer
//    }
//}
//
//val solution = Solution()
//val result = solution.solution(10,2)
//println("결과 : $result")

class Solution {

    fun solution(n: Int, k: Int): Int {
        val service = n / 10 // Calculate the number of free drinks for every 10 ordered
        val totalCost = n * 12000 + (k - service) * 2000 // Calculate the total cost

        println("$n 인분을 시켜 서비스로 음료수를 $service 개 받아 총 $totalCost 원입니다.")

        return totalCost
    }
}

val solution = Solution()
val result = solution.solution(64, 6)
println("결과: $result")
