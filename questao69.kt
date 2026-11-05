fun main() {
    print("\ndigite numerador: ")
    val num = readLine()!!.toDouble()
    print("\ndigite denominador: ")
    val denom = readLine()!!.toDouble()
    println("\ndecimal: ${num / denom}")
}