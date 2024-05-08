class Car(
    private val model: String,
    var speed: Int,
    var gas: Int
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
}

val myCar = Car(
    "socar", 50, 100
)

println(myCar.speed)
println(myCar.increaseSpeed())
println(myCar.addGas(20))
println(myCar.increaseSpeed())
