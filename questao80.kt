fun main() {
    print("\n Digite a quantidade de fitas: ")
    val quant = readLine()!!.toInt()
    print("\n Digite o valor do aluguel: ")
    val valAluguel = readLine()!!.toDouble()
    val fatAnual = (quant / 3.0) * valAluguel * 12.0
    println("\n Faturamento anual: $fatAnual")
}