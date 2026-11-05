fun main() {
    print("\ndigite numero: ")
    val numero = readLine()!!.toInt()
    if (numero % 5 == 0) {
        println("\ne divisivel por 5")
    } else {
        println("\nnao e divisivel por 5")
    }
}