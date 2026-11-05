fun main() {
    print("digite palavra 1: ")
    val c = readLine()!!
    print("digite palavra 2: ")
    val cl = readLine()!!
    println(c.length)
    println("concatenando: $c$cl")
    val d = c
    println("E O CONTEUDO DE D: $d")
    val dl = c + cl
    println("concatenacao: $dl")
    println("primeiro caractere: ${c.first()}")
    println("ultimo caractere: ${c.last()}")
    println("todos menos o primeiro: ${c.substring(1)}")
    println("o terceiro elemento: ${c[3]}")
    println("os tres primeiros elementos: ${c.take(3)}")
    println("os tres ultimos elementos: ${c.takeLast(3)}")
}