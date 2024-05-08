class Car(
    private val model: String,
    val speed: Int,
    var gas: Int
) {

    private val plusSpeed = 10
    fun increaseSpeed(): Int {
        return speed + plusSpeed
    }

    fun addGas(newGas: Int): Int {
        gas += newGas
        return gas
    }   
}

val myCar = Car(
    "socar", 50, 100
)

println(myCar.speed) // Prints 50
println(myCar.increaseSpeed()) // Prints 60
println(myCar.addGas(20)) // Prints 120
