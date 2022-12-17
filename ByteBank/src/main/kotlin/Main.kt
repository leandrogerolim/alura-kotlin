fun main() {
    println("Bem vindo ao Bytebank")
    var contaAlex = Conta()
    contaAlex.titular = "leandro"
    contaAlex.numero = 100
    contaAlex.saldo = 1254.00
    //Conta().titular = "Leandro"  // cria a conta como se fosse Conta conta = new conta();
    println("Titular: ${contaAlex.titular}")
    println("Conta: ${contaAlex.numero}")
    println("Saldo: ${contaAlex.saldo}")
    println()
    var contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 101
    contaFran.saldo = 458.00
    println("Titular: ${contaFran.titular}")
    println("Conta: ${contaFran.numero}")
    println("Saldo: ${contaFran.saldo}")
    println()
    println("Depositando na conta do Alex")
    deposita(contaAlex, 50.00)
    println("Saldo atual ${contaAlex.saldo}")

    println("Depositando na conta do Fran")
    deposita(contaFran, 458.00)
    println("Saldo atual: ${contaFran.saldo}")
}


class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun deposita(conta: Conta, valor: Double) {
    conta.saldo += valor

}

fun testaCopiasEReferencias() {

    var numeroX = 10
    var numeroY = numeroX
    numeroY++

    val contaJoao = Conta()
    contaJoao.titular = "João"

    var contaMaria = contaJoao
    contaMaria.titular = "Maria"
    println("titular conta joão: ${contaJoao.titular}")
    println("titular conta Maria: ${contaMaria.titular}")

    println("número X $numeroX")
    println("número Y $numeroY")
}

fun testaLacos() {
    var i = 0;
    while (i < 5) {
        val titular: String = "Alex $i";
        val numeroConta: Int = 1000 + i;
        var saldo = i + 10.0;

        println("titular $titular");
        println("número da conta $numeroConta");
        println("saldo da conta $saldo");
        println();
        i++;
    }
}

fun testaCondicoes(saldo: Double) {

    when {// no lugar do if
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é Neutra")
        else -> println("Conta é negativa")
    }
}