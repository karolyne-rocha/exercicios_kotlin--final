fun main() {
    print("\nentre com um número de 3 dígitos: ")
    val num = readLine()!!.toInt()
    val c = num / 100
    val d = (num % 100) / 10
    val u = num % 10
    val num1 = u * 100 + d * 10 + c
    println("\nnúmero: $num\ninvertido: $num1")
}