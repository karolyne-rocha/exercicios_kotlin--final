import kotlin.math.sqrt

fun main() {
    print("\nEntrar com 1 cateto: ")
    val b = readLine()!!.toDouble()
    print("\nEntrar com 2 cateto: ")
    val c = readLine()!!.toDouble()
    val a = sqrt(b * b + c * c)
    println("\nA hipotenusa e: $a")
}