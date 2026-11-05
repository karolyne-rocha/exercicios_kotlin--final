fun main() {
    print("\nEntrar com o lo termo: ")
    val termo = readLine()!!.toInt()
    print("\nEntrar com a razao: ")
    val razao = readLine()!!.toInt()
    val dec = termo + 9 * razao
    println("\no 10 termo desta P.A. e: $dec")
}