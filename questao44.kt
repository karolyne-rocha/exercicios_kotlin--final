import kotlin.math.ln

fun main() {
    print("\nentre com o logaritmando: ")
    val num = readLine()!!.toDouble()
    print("\nentre com a base: ")
    val base = readLine()!!.toDouble()
    val logaritmo = ln(num) / ln(base)
    println("\no logaritmo de $num na base $base e: $logaritmo")
}