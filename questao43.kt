import kotlin.math.ln

fun main() {
    print("\nentre com o logaritmando: ")
    val num = readLine()!!.toDouble()
    val logaritmo = ln(num) / ln(10.0)
    println("\nlogaritmo: $logaritmo")
}