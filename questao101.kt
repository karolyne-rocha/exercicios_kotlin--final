fun main() {
    print("\ndigite numero: ")
    val num = readLine()!!.toDouble()
    if (num > 20.0 && num < 90.0) {
        println("\no número está na faixa de 20 a 90")
    } else {
        println("\no número está fora da faixa de 20 a 90")
    }
}