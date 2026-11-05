fun main() {
    print("\nDigite data no formato DDMMAA: ")
    val data = readLine()!!.toInt()
    val dia = data / 10000
    val mes = data % 10000 / 100
    val ano = data % 100
    val ndata = mes * 10000 + dia * 100 + ano
    println("\nDIA: $dia\nMES: $mes\nANO: $ano\n\nDATA NO FORMATO MMDDAA: $ndata")
}