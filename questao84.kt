fun main() {
    print("\nDigite numero: ")
    val a = readLine()!!.toInt()
    if (a % 2 == 0) {
        println("\nPAR")
    } else {
        println("\nIMPAR")
    }
}