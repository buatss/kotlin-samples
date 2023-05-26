import geometry.shapes.*

fun main(args: Array<String>) {
    val rectangle : Rectangle = createRandomRectangle()
    println("Height: " + rectangle.height)
    println("Width: " + rectangle.width)
    println("Is this rectangle a square: " + rectangle.isSquare)
}
