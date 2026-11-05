fun main() {
    print("\ndigite a altura da lata: ")
    val altura = readLine()!!.toDouble()
    print("\ndigite o raio da lata: ")
    val raio = readLine()!!.toDouble()
    val volume = Math.PI * raio * raio * altura
    println("\no volume da lata e = $volume")
}