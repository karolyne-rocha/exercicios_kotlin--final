fun main() {
    print("\ndigite nome: ")
    val nome = readLine()!!
    val p = nome.take(5)
    if (p.equals("JOSÉ", true) || nome.equals("JOSÉ", true)) {
        println("\n$nome")
    }
}