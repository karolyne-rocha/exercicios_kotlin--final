fun main() {
    print("\ndigite numero: ")
    val numero = readLine()!!.toDouble()
    if (numero > 20.0) {
        println("\nmaior que 20")
    } else if (numero < 20.0) {
        println("\nmenor que 20")
    } else {
        println("\nigual a 20")
    }
}