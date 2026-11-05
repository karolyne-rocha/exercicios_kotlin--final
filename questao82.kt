fun main() {
    print("digite numero: ")
    val numero = readLine()!!.toDouble()
    if (numero > 20.0) {
        println("\nmetade: ${numero / 2.0}")
    }
}