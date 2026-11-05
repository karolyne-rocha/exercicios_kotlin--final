fun main() {
    print("\ndigite saldo: ")
    val saldo = readLine()!!.toDouble()
    val nsaldo = saldo * 1.01
    println("\nnovo saldo: $nsaldo")
}