import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    print("\ndigite numero: ")
    val numero = readLine()!!.toDouble()
    if (numero > 0.0) {
        println("\nraiz: ${sqrt(numero)}")
    } else if (numero < 0.0) {
        println("\nquadrado: ${numero.pow(2.0)}")
    }
}