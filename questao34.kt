fun main() {
    print("\n entre com um numero: ")
    val numero = readLine()!!.toInt()
    val ant = numero - 1
    val suc = numero + 1
    println("o sucessor e $suc e o antecessor e $ant")
}