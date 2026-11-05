import kotlin.math.sqrt

fun main() {
    print("\nentre com a base: ")
    val a = readLine()!!.toDouble()
    print("\nentre com a altura: ")
    val b = readLine()!!.toDouble()
    print("\nentre com a profundidade: ")
    val c = readLine()!!.toDouble()
    val diagonal = sqrt(a * a + b * b + c * c)
    println("diagonal: $diagonal")
}