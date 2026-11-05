fun main() {
    print("\ndigite 1º nome: ")
    val nome1 = readLine()!!
    print("\ndigite 2º nome: ")
    val nome2 = readLine()!!
    if (nome1 < nome2) {
        println("\n$nome1 $nome2")
    } else {
        println("\n$nome2 $nome1")
    }
}