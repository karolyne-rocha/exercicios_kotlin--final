fun main() {
    print("\ndigite 1a nota: ")
    val nota1 = readLine()!!.toDouble()
    print("\ndigite 2a nota: ")
    val nota2 = readLine()!!.toDouble()
    val media = (nota1 + nota2) / 2.0
    println("\nmedia: $media")
}