fun main() {
    print("\ndigite 1º numero: ")
    val a = readLine()!!.toDouble()
    print("\ndigite 2º numero: ")
    val b = readLine()!!.toDouble()
    if (a > b) {
        println("\nmaior: $a")
    } else {
        println("\nmaior: $b")
    }
}