fun main() {
    print("\ndigite sigla: ")
    val sigla = readLine()!!
    when (sigla) {
        "RJ", "rj" -> println("\ncarioca")
        "SP", "sp" -> println("\npaulista")
        "MG", "mg" -> println("\nmineiro")
        else -> println("\noutros estados")
    }
}