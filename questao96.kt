fun main() {
    print("\ndigite numero: ")
    val numero = readLine()!!.toInt()
    if (numero % 3 == 0 && numero % 7 == 0) {
        println("\ndivisível por 3 e por 7")
    } else {
        println("\nnão e divisível por 3 e por 7")
    }
}