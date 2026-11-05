fun main() {
    print("\nentre com depósito: ")
    val deposito = readLine()!!.toDouble()
    print("\nentre com a taxa de juros: ")
    val taxa = readLine()!!.toDouble()
    val valor = deposito * taxa / 100.0
    val total = deposito + valor
    println("\nRendimentos: $valor\nTotal: $total")
}