fun main() {
    print("\nDigite numero de tres casas: ")
    val a = readLine()!!.toInt()
    val d = (a / 10) % 10
    println("\nalgarismo da casa das dezenas: $d")
}