fun main() {
    print("\nentre com nome: ")
    val nome = readLine()!!
    println("\ntodo nome: $nome")
    println("primeiro caractere: ${nome.first()}")
    println("ultimo caractere: ${nome.last()}")
    println("primeiro ao terceiro: ${nome.take(3)}")
    println("quarto caractere: ${nome[3]}")
    println("todos menos o primeiro: ${nome.substring(1)}")
}