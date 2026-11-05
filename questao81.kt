fun main() {
    print("\nDigite conta de tres digitos: ")
    val conta = readLine()!!.toInt()
    val d1 = conta / 100
    val d2 = (conta % 100) / 10
    val d3 = conta % 10
    val inv = d3 * 100 + d2 * 10 + d1
    val soma = conta + inv
    val digito = ((soma / 100) * 1 + ((soma % 100) / 10) * 2 + (soma % 10) * 3) % 10
    println("\ndigito verificador: $digito")
}