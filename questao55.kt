fun main() {
    print("\nmedida da diagonal maior: ")
    val diagmaior = readLine()!!.toDouble()
    print("\nmedida da diagonal menor: ")
    val diagmenor = readLine()!!.toDouble()
    val area = (diagmaior * diagmenor) / 2.0
    println("\narea = $area")
}