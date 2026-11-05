fun main() {
    print("\nDigite numero: ")
    val num = readLine()!!.toDouble()
    if (num > 0.0) {
        println("\nPOSITIVO")
    } else if (num < 0.0) {
        println("\nNEGATIVO")
    } else {
        println("\nNULO")
    }
}