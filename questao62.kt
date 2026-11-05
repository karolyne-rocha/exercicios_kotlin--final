fun main() {
    print("\ndigite valor do produto: ")
    val preco = readLine()!!.toDouble()
    val npreco = preco * 0.91
    println("\npreco com desconto: $npreco")
}