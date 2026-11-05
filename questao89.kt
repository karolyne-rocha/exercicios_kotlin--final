fun main() {
    print("Escolha o planeta (1 a 6): ")
    val op = readLine()!!.toInt()
    print("Entre com o peso na Terra: ")
    val pterra = readLine()!!.toDouble()
    val pesoPlaneta = when (op) {
        1 -> (pterra / 10.0) * 0.37
        2 -> (pterra / 10.0) * 0.88
        3 -> (pterra / 10.0) * 0.38
        4 -> (pterra / 10.0) * 2.64
        5 -> (pterra / 10.0) * 1.15
        6 -> (pterra / 10.0) * 1.17
        else -> 0.0
    }
    println("Peso no planeta: $pesoPlaneta")
}