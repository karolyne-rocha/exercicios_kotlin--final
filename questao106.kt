fun main() {
    print("\ndigite nome: ")
    val nome = readLine()!!
    val letra = nome.first().toString()
    if (letra == "A" || letra == "a") {
        println("\n$nome")
    }
}