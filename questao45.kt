import kotlin.math.sqrt

fun main() {
    print("\ndigite numero: ")
    val num = readLine()!!.toDouble()
    val quad = num * num
    val raizquad = sqrt(num)
    println("\nnumero: $num\nquadrado: $quad\nraiz quadrada: $raizquad")
}