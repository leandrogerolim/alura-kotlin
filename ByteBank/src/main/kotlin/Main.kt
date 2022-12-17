fun main() {
    println("Bem vindo ao Bytebank")
    val titular: String = "Leandro"
    val numeroConta: Int = 1000
    var saldo: Double = 2.0
    //saldo = 100 + 2.0
    //saldo += 200

    println("Titular: $titular")
    println("Numero Conta: $numeroConta")
    println("Saldo: $saldo")

    //testaCondicoes(saldo)
}

fun testaCondicoes(saldo: Double) {

    when {// no lugar do if
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é Neutra")
        else -> println("Conta é negativa")
    }
}