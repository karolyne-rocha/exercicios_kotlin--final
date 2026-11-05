fun main() {
    print("\nentre com hora atual: ")
    val hora = readLine()!!.toInt()
    print("\nentre com minutos: ")
    val minuto = readLine()!!.toInt()
    val tminuto = hora * 60 + minuto
    println("\nAte agora se passaram: $tminuto minutos")
}