// Liskov Substitution Principle: everything that applies to a base class should apply to all its children
//                              i.e. if a base class reference points to a child, all its methods should work

abstract class Shape2(var p1: Double, var p2: Double, var p3: Double) {
    abstract fun calculateArea(): Double
}

class Square2(p1: Double, p2: Double, p3: Double): Shape2(p1, p2, p3){

    override fun calculateArea(): Double {return this.p1 * this.p1}
}

class Rectangle2(p1: Double, p2: Double, p3: Double): Shape2(p1, p2, p3){

    override fun calculateArea(): Double {return this.p1 * this.p2}
}

fun main() {
    val mySquare: Shape2 = Square2(1.0, 2.0, 3.0)
    val myRectangle: Shape2 = Rectangle2(1.0, 2.0, 3.0)
    println(mySquare.calculateArea())
    println(myRectangle.calculateArea())
}