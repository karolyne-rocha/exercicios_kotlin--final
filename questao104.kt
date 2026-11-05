fun main() {
    print("\ndigite nome: ")
    val nome = readLine()!!
    print("\ndigite sexo: ")
    val sexo = readLine()!!
    print("\ndigite idade: ")
    val idade = readLine()!!.toInt()
    if ((sexo == "F" || sexo == "f") && idade < 25) {
        println("\n$nome ACEITA")
    } else {
        println("\n$nome NÃO ACEITA")
    }
}