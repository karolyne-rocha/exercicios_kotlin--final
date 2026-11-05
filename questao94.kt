fun main() {
    print("\ndigite numero: ")
    val numero = readLine()!!.toInt()
    if (numero % 3 == 0) {
        println("\nmultiplo de 3")
    } else {
        println("\nnao e multiplo de 3")
    }
}