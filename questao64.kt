fun main() {
    print("\ndigite o valor da temperatura em graus centigrados: ")
    val c = readLine()!!.toDouble()
    val f = (9 * c + 160) / 5.0
    println("\no valor da temperatura em graus fahrenheit e = $f")
}