val n = 7
val array = mutableListOf<Int>()

for (i in 1..n) {
    if (i % 2 == 1) {
        array.add(i)
    }
}

println(array)

for (num in array) {
    println("*".repeat(num))
}

val numbers = 1..100

//FizzBuzz
for (i in numbers){
    when{
        i%15 == 0 -> print("FizzBuzz ")
        i%5 == 0 -> print("Buzz ")
        i%3 == 0 -> print(("Fizz "))
        else -> print("$i ")
    }
}

//1.1부터 100까지 출력
println(numbers)

for (i in numbers) {
    print(i)
}

//2.1부터 100까지 합 출력
var sum = 0
for (i in numbers) {
    sum += i
}
println(sum)

//3. 1부터 100까지 짝수만 출력
//for (i in numbers) {
//    if (i % 2 == 0) {
//        print(i)
//    }
//}

for (i in numbers) {
    when {
        i % 2 == 0 -> print("$i  ")
    }
}

//4. 1부터 100까지 짝수의 합 출력
var sum_2 = 0
//for (i in numbers) {
//    if (i % 2 == 0) {
//        sum_2 += i
//    }
//}
for (i in numbers) {
    when {
        i % 2 == 0 -> sum_2 += i
    }
}
println(sum_2)

