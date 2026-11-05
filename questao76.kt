fun main() {
    print("\ndigite numero: ")
    val num = readLine()!!.toInt()
    println("\nsucessor: ${(num + 1) % 61}")
}