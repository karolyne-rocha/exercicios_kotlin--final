fun main() {
    print("\nQual a capital do Brasil? ")
    val resp = readLine()!!
    if (resp == "BRASÍLIA" || resp == "Brasília") {
        println("\nPARABÉNS!")
    } else {
        println("\nERRADO! ESTUDE MAIS!")
    }
}