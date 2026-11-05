fun main() {
    print("\nentre com o salário mínimo: ")
    val sm = readLine()!!.toDouble()
    print("\nentre com a quantidade em quilowatt: ")
    val qtdade = readLine()!!.toDouble()
    val preco = sm / 700.0
    val vp = preco * qtdade
    val vd = vp * 0.9
    println("\npreço do quilowatt: $preco\nvalor a ser pago: $vp\nvalor com desconto: $vd")
}