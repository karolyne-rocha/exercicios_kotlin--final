fun main() {
    print("\nDigite numero de tres casas: ")
    val a = readLine()!!.toInt()
    val d = a % 100 / 10
    println("\nalgarismo da casa das dezenas: $d")
}