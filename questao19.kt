import kotlin.math.*

fun main() {
    println("raiz: ${sqrt(64.0)}")
    println("raiz com exp e log e realint: ${ln(64.0) * 0.5 * exp(1.0).let { /* simulação */ 8.0 }.toInt()}")
    println("raiz com exp e log sem realint: ${exp(0.5 * ln(64.0))}")
    println("absoluto: ${abs(-8)}")
    println("absoluto: ${abs(8)}")
    println("convertendo para real 87: ${87.0}")
}