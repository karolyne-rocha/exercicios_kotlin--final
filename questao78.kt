fun main() {
    print("\ndigite o numero de lados do poligono: ")
    val n = readLine()!!.toInt()
    val nd = n * (n - 3) / 2.0
    println("\nnumero de diagonais: $nd")
}