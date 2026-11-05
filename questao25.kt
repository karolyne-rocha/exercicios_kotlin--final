fun main() {
    print("\nDigite data no formato ddmmaa: ")
    val data = readLine()!!.toInt()
    val dia = data / 10000
    val mes = data % 10000 / 100
    val ano = data % 100
    println("\nDIA: $dia\nMES: $mes\nANO: $ano")
}