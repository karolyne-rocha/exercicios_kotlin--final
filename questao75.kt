fun main() {
    print("\nentre com seu peso, so a parte inteira: ")
    val peso = readLine()!!.toInt()
    val pesogramas = peso * 1000
    val novopeso = pesogramas * 1.12
    println("\npeso em gramas: $pesogramas\nnovo peso: $novopeso")
}