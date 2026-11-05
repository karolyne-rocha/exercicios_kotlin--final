fun main() {
    print("\ndigite 1 numero: ")
    var a = readLine()!!.toDouble()
    print("\ndigite 2 numero: ")
    var b = readLine()!!.toDouble()
    print("\ndigite 3 numero: ")
    var c = readLine()!!.toDouble()
    var aux: Double
    if (a > b) { aux = a; a = b; b = aux }
    if (a > c) { aux = a; a = c; c = aux }
    if (b > c) { aux = b; b = c; c = aux }
    println("\nOrdem Decrescente: $c $b $a")
}