fun main() {
    print("\ndigite pr1: ")
    val pr1 = readLine()!!.toDouble()
    print("\ndigite pr2: ")
    val pr2 = readLine()!!.toDouble()
    val mf = (pr1 + pr2) / 2.0
    println("\nmedia arredondada: ${mf.toInt()}")
}