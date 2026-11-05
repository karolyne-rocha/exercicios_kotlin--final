fun main() {
    print("\ndigite 1 numero: ")
    val num1 = readLine()!!.toDouble()
    print("\ndigite 2 numero: ")
    val num2 = readLine()!!.toDouble()
    val soma = num1 + num2
    if (soma > 20.0) {
        println("\nsoma: ${soma + 8}")
    } else {
        println("\nsoma: ${soma - 5}")
    }
}