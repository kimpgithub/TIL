enum class Color(val colorName: String){
    Red("빨강"),
    Green("초록"),
    Blue("파랑")
}

class Car(
    private val model: String,
    var speed: Int,
    var gas: Int,
    var color: Color
) {

    private val plusSpeed = 10
    fun increaseSpeed(): Int {
        speed += plusSpeed
        return speed
    }

    fun addGas(newGas: Int): Int {
        gas += newGas
        return gas
    }
    fun getColor(){
        println(color.colorName)
        }
    }


val myCar = Car(
    "socar", 50, 100, Color.Blue
)

println(myCar.speed)
println(myCar.increaseSpeed())
println(myCar.addGas(20))
println(myCar.increaseSpeed())
println(myCar.getColor())
