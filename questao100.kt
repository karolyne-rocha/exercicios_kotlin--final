fun main() {
    print("\nnumero de 4 algarismos: ")
    val num = readLine()!!.toInt()
    val c = num / 100
    if (c % 4 == 0) {
        println("\no numero e multiplo de 4: $c")
    } else {
        println("\no numero nao e multiplo de 4: $c")
    }
}