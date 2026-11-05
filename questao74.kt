fun main() {
    print("\nentre com o salario minimo: ")
    val salmin = readLine()!!.toDouble()
    print("\nentre com o salario da pessoa: ")
    val salpe = readLine()!!.toDouble()
    val num = salpe / salmin
    println("\na pessoa ganha $num salarios minimos")
}