import kotlin.math.abs

fun main() {
    print("digite numero: ")
    val numero = readLine()!!.toDouble()
    if (numero > 0.0) {
        println("\ninverso: ${1.0 / numero}")
    } else {
        println("absoluto: ${abs(numero)}")
    }
}