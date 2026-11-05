fun main() {
    print("\nentre com o dividendo: ")
    val val1 = readLine()!!.toInt()
    print("\nentre com divisor: ")
    val val2 = readLine()!!.toInt()
    val quoc = val1 / val2
    val rest = val1 % val2
    println("\ndividendo : $val1\ndivisor : $val2\nquociente : $quoc\nresto : $rest")
}