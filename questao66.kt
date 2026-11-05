fun main() {
    print("\ndigite o tempo gasto: ")
    val tempo = readLine()!!.toDouble()
    print("\ndigite a velocidade media: ")
    val vel = readLine()!!.toDouble()
    val dist = tempo * vel
    val litros = dist / 12.0
    println("\nvelocidade = $vel\ntempo = $tempo\ndistancia = $dist\nlitros = $litros")
}