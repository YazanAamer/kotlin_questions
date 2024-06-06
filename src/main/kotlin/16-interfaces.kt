import kotlin.math.abs

interface Drivable {
    var posX: Int
    var posY: Int
    fun drive(x: Int, y: Int) { posX += x; posY += y }
}

class Car: Drivable {
    override var posX: Int = 0
    override var posY: Int = 0

    override fun drive(x: Int, y: Int) {
        if (abs(x) >= abs(y)) {
            posX += x * 2
        } else {
            posY += y * 2
        }
    }
}

class Bike: Drivable {
    override var posX: Int = 0
    override var posY: Int = 0
}

fun main () {
    val myBike: Drivable = Car()
    myBike.drive(1, 2)
    println("myBike; x=${myBike.posX}, y=${myBike.posY})")
    val myCar = Car()
    myCar.drive(1, 2)
    println("myCar; x=${myCar.posX}, y=${myCar.posY})")
}