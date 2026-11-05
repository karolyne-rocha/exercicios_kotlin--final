fun main() {
    print("\nentre com um numero com parte fracionaria: ")
    val num = readLine()!!.toDouble()
    val numi = num.toInt()
    val numfrac = num - numi
    println("\nparte inteira: $numi\nparte fracionaria: $numfrac\nnumero arredondado: ${num.roundToInt()}")
}