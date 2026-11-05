fun main() {
    print("\ndigite 1 numero com ponto: ")
    var a = readLine()!!.toDouble()
    print("\ndigite 2 numero com ponto: ")
    var b = readLine()!!.toDouble()
    val aux = a
    a = b
    b = aux
    println("\na = $a\nb = $b")
}