import kotlin.math.PI

open class Shape {
    var shapeArea: Double = 0.0
    open fun area(dim1: Double) {
        shapeArea = dim1 * dim1
    }
    open fun area(dim1: Double, dim2: Double) {
        shapeArea = dim1 * dim2
    }
}

class Rectangle : Shape() {
    override fun area(dim1: Double, dim2: Double) {
        this.shapeArea = dim1 * dim2
    }
}

class Circle : Shape() {
    override fun area(dim1: Double) {
        this.shapeArea = PI * dim1 * dim1
    }
}

fun main () {
    val rect = Rectangle()
    rect.area(10.0, 2.0)
    println(rect.shapeArea)
    val circle = Circle()
    circle.area(10.0)
    println(circle.shapeArea)
}