import kotlin.math.*

fun main() {
    print("\ndigite um angulo em graus: ")
    val angulo = readLine()!!.toDouble()
    val rang = angulo * PI / 180.0
    println("\nseno: ${sin(rang)}")
    println("\nco-seno: ${cos(rang)}")
    println("\ntangente: ${tan(rang)}")
}