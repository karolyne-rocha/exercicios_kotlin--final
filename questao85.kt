fun main() {
    print("\ndigite 1 numero: ")
    val a = readLine()!!.toDouble()
    print("\ndigite 2 numero: ")
    val b = readLine()!!.toDouble()
    print("\ndigite 3 numero: ")
    val c = readLine()!!.toDouble()
    var max = a
    if (b > max) max = b
    if (c > max) max = c
    println("\n$max")
}