fun main() {
    print("\nhoras trabalhadas: ")
    val na = readLine()!!.toInt()
    print("\nvalor da hora-aula: ")
    val vha = readLine()!!.toDouble()
    print("\npercentual de desconto: ")
    val pd = readLine()!!.toDouble()
    val sb = na * vha
    val td = (pd / 100.0) * sb
    val sl = sb - td
    println("\nsalario liquido: $sl")
}