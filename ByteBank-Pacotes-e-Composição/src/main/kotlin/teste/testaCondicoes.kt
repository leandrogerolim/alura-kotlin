fun testaCondicoes(saldo: Double) {

    when {// no lugar do if
        saldo > 0.0 -> println("modelo.Conta é positiva")
        saldo == 0.0 -> println("modelo.Conta é Neutra")
        else -> println("modelo.Conta é negativa")
    }
}