fun main() {
    print("\ndigite 1 numero: ")
    val a = readLine()!!.toDouble()
    print("\ndigite 2 numero: ")
    val b = readLine()!!.toDouble()
    print("\ndigite 3 numero: ")
    val c = readLine()!!.toDouble()
    var maior = a
    if (b > maior) maior = b
    if (c > maior) maior = c
    println("\nmaior: $maior")
}