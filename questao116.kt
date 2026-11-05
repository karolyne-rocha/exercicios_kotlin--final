fun main() {
    print("\ndigite 1 numero: ")
    val a = readLine()!!.toDouble()
    print("\ndigite 2 numero: ")
    val b = readLine()!!.toDouble()
    print("\ndigite 3 numero: ")
    val c = readLine()!!.toDouble()
    if (a > b && a > c) {
        println("\nmaior: $a")
    } else if (b > c) {
        println("\nmaior: $b")
    } else {
        println("\nmaior: $c")
    }
}