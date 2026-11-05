import kotlin.math.sqrt

fun main() {
    print("\ndigite base: ")
    val base = readLine()!!.toDouble()
    print("\ndigite altura: ")
    val altura = readLine()!!.toDouble()
    val perimetro = 2 * (base + altura)
    val area = base * altura
    val diagonal = sqrt(base * base + altura * altura)
    println("\nperimetro = $perimetro\narea = $area\ndiagonal = $diagonal")
}