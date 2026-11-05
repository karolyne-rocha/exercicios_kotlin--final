fun main() {
    print("\nEntre com ano atual: ")
    val anoa = readLine()!!.toInt()
    print("\nEntre com ano de nascimento: ")
    val anon = readLine()!!.toInt()
    if (anon > anoa) {
        println("\nAno de Nascimento Invalido")
    } else {
        println("\nIdade: ${anoa - anon}")
    }
}