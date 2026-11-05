fun main() {
    print("\nDigite opcao (+, -, *, /): ")
    val resp = readLine()!!
    print("\ndigite 1 numero: ")
    val a = readLine()!!.toDouble()
    print("\ndigite 2 numero: ")
    val b = readLine()!!.toDouble()
    when (resp) {
        "+" -> println("SOMA: ${a + b}")
        "-" -> println("SUBTRACAO: ${a - b}")
        "*" -> println("MULTIPLICACAO: ${a * b}")
        "/" -> println("DIVISAO: ${a / b}")
        else -> println("OPCAO NAO DISPONIVEL!")
    }
}