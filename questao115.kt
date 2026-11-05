import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    print("\ndigite valor de x: ")
    val x = readLine()!!.toDouble()
    print("\ndigite valor de y: ")
    val y = readLine()!!.toDouble()
    if (x > y) {
        println("\n${sqrt(x)}\n${y.pow(2.0)}")
    } else if (y > x) {
        println("\n${sqrt(y)}\n${x.pow(2.0)}")
    } else {
        println("\nnumeros iguais")
    }
}