fun main() {
    print("\ndigite o salario: ")
    val sb = readLine()!!.toDouble()
    print("\ndigite o valor da prestacao: ")
    val vp = readLine()!!.toDouble()
    if (vp <= 0.3 * sb) {
        println("\nemprestimo concedido")
    } else {
        println("\nemprestimo negado")
    }
}