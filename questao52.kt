import kotlin.math.sqrt

fun main() {
    print("\ndigite o lado do quadrado: ")
    val lado = readLine()!!.toDouble()
    val perimetro = 4 * lado
    val area = lado * lado
    val diagonal = lado * sqrt(2.0)
    println("\nperimetro: $perimetro\narea: $area\ndiagonal: $diagonal")
}