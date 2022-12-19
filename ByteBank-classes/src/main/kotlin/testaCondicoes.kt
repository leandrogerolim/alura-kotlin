fun testaCondicoes(saldo: Double) {

    when {// no lugar do if
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é Neutra")
        else -> println("Conta é negativa")
    }
}