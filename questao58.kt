import kotlin.math.ln

fun main() {
    print("\nEntrar com 1 valor: ")
    val xnum1 = readLine()!!.toDouble()
    print("\nEntrar com 2 valor: ")
    val xnum2 = readLine()!!.toDouble()
    print("\nEntrar com 3 valor: ")
    val xnum3 = readLine()!!.toDouble()
    val x = xnum1 + xnum2 / (xnum3 + xnum1) + 2 * (xnum1 - xnum2) + ln(64.0) / ln(2.0)
    println("\nX = $x")
}