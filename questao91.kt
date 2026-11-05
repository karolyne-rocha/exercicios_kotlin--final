fun main() {
    print("\ndigite 1 numero: ")
    val num1 = readLine()!!.toInt()
    print("\ndigite 2 numero: ")
    val num2 = readLine()!!.toInt()
    val soma = num1 + num2
    if (soma > 10) {
        println("\nsoma: $soma")
    }
}