import kotlin.math.pow

fun main() {
    print("\ndigite o valor da aplicacao: ")
    val p = readLine()!!.toDouble()
    print("\ndigite a taxa (0-1): ")
    val i = readLine()!!.toDouble()
    print("\ndigite o numero de meses: ")
    val n = readLine()!!.toInt()
    val va = p * (((1.0 + i).pow(n.toDouble())) - 1.0) / i
    println("\no valor acumulado: $va")
}