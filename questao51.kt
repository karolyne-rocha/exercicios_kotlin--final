fun main() {
    print("\ndigite raio: ")
    val raio = readLine()!!.toDouble()
    val perimetro = 2 * Math.PI * raio
    val area = Math.PI * raio * raio
    println("\nperimetro: $perimetro\narea: $area")
}