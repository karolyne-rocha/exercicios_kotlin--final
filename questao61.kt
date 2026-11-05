import kotlin.math.pow

fun main() {
    print("\nEntre com o lo termo: ")
    val termo = readLine()!!.toInt()
    print("\nEntre com a razao: ")
    val razao = readLine()!!.toInt()
    val quinto = termo * razao.toDouble().pow(4.0).toInt()
    println("\no 5 termo desta P.G. e: $quinto")
}