fun main() {
    print("\nentre com 1 numero: ")
    val a = readLine()!!.toDouble()
    print("\nentre com 2 numero: ")
    val b = readLine()!!.toDouble()
    print("\nentre com 3 numero: ")
    val c = readLine()!!.toDouble()
    print("\nentre com 4 numero: ")
    val d = readLine()!!.toDouble()
    val mp = (a * 1 + b * 2 + c * 3 + d * 4) / 10.0
    println("\nmedia ponderada: $mp")
}