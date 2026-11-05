import kotlin.math.pow

fun main() {
    print("\ndigite 1 numero: ")
    val a = readLine()!!.toDouble()
    print("\ndigite 2 numero: ")
    val b = readLine()!!.toDouble()
    val d = (a - b).pow(2.0)
    val q = a.pow(2.0) - b.pow(2.0)
    println("\no quadrado da diferenca = $d\ndiferenca dos quadrados = $q")
}