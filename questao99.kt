fun main() {
    print("\nnumero de 3 algarismos: ")
    val num = readLine()!!.toInt()
    val c = num / 100
    if (c % 2 == 0) {
        println("\no algarismo das centenas e par: $c")
    } else {
        println("\no algarismo das centenas e impar: $c")
    }
}