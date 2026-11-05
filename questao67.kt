fun main() {
    print("\ndigite o valor da prestação: ")
    val valor = readLine()!!.toDouble()
    print("\ndigite a taxa: ")
    val taxa = readLine()!!.toDouble()
    print("\ndigite o tempo (numero de meses): ")
    val tempo = readLine()!!.toInt()
    val prest = valor + (valor * (taxa / 100.0) * tempo)
    println("\no valor da prestacao em atraso e = $prest")
}