import kotlin.math.sin
import kotlin.math.cos
import kotlin.math.abs

interface Drivable {
    var posX: Double
    var posY: Double
    var facing: Double
    var maxSteering: Double
    fun steer(deg: Double) {
        var deg_ = deg
        if (abs(deg_) > maxSteering) {deg_ = (deg_ / abs(deg_)) * maxSteering}
        facing += deg_
    }
    fun drive()
}

class Car: Drivable {
    override var posX: Double = 0.0
    override var posY: Double = 0.0
    override var facing: Double = 0.0
    override var maxSteering: Double = 30.0
    override fun drive() { val facingRad = Math.toRadians(this.facing); this.posX += (sin(facingRad)); this.posY += (cos(facingRad)) }
}

class Bike: Drivable {
    override var posX: Double = 0.0
    override var posY: Double = 0.0
    override var facing: Double = 0.0
    override var maxSteering: Double = 90.0
    override fun drive() {
        val facingRad = Math.toRadians(this.facing)
        val xDir = sin(facingRad) / (sin(facingRad) + cos(facingRad))
        this.posX += xDir; this.posY += 1-xDir
    }
}

fun main () {
<<<<<<< Updated upstream
    val myBike: Drivable = Car()
    myBike.drive(1, 2)
    println("myBike; x=${myBike.posX}, y=${myBike.posY})")
=======
>>>>>>> Stashed changes
    val myCar = Car()
    myCar.steer(10.0)
    myCar.drive()
    myCar.steer(30.0)
    myCar.steer(30.0)
    myCar.steer(30.0)
    myCar.drive()
    println(myCar.facing)
    println("myCar; x=${myCar.posX}, y=${myCar.posY})")

    val myBike = Bike()
    myBike.drive()
    myBike.steer(90.0)
    myBike.drive()
    println("myBike; x=${myBike.posX}, y=${myBike.posY})")
}