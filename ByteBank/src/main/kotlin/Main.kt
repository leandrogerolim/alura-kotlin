fun main() {
    println("Bem vindo ao Bytebank")
    var contaAlex = Conta("Leandro", 100)
    contaAlex.deposita(1254.00)
    //Conta().titular = "Leandro"  // cria a conta como se fosse Conta conta = new conta();
    println("Titular: ${contaAlex.titular}")
    println("Conta: ${contaAlex.numero}")
    println("Saldo: ${contaAlex.saldo}")
    println()
    var contaFran = Conta("Fran", 101)
    contaFran.deposita(458.00)
    println("Titular: ${contaFran.titular}")
    println("Conta: ${contaFran.numero}")
    println("Saldo: ${contaFran.saldo}")
    println()
    println("Depositando na conta do Alex")

    contaAlex.deposita(50.00)
    println("Saldo depois de depositar: ${contaAlex.saldo}")
    contaAlex.saca(150.00)
    println("Saldo depois de sacar: ${contaAlex.saldo}")
    println()
    println("Depositando na conta do Fran")
    contaFran.deposita(458.00)
    println("Saldo depois de depositar: ${contaFran.saldo}")
    contaFran.saca(875.00)
    println("Saldo depois de sacar: ${contaFran.saldo}")
    println()
    println("Transferencia da conta da Fran para a do Alex")

    if (contaFran.transferencia(21.00, contaAlex)) {
        println("Sucesso na transferencia")
    } else {
        println("Falha na transferencia saldo insuficiente")
    }

    println()

    println("Saldo atual Fran: ${contaFran.saldo}")
    println("Saldo atual Alex: ${contaAlex.saldo}")


}


class Conta(val titular: String, val numero: Int) {
    //var titular = titular
    //var numero = numero //posso colocar a variavel diretamente no constructor.
    var saldo = 0.0
        private set
    //constructor(titular: String, numero: Int){  //o construtor pode ser usado diretamente na classe sem dar problemas.
    //   this.titular = titular
    //    this.numero = numero

    // }


    fun deposita(valor: Double) {
        if (valor > 0.0) {
            this.saldo += valor  //this.saldo do proprio objeto

        }

    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transferencia(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        } else {
            return false
        }


    }


}

fun testaCopiasEReferencias() {

    var numeroX = 10
    var numeroY = numeroX
    numeroY++

    val contaJoao = Conta("Jo??o", 558)

    var contaMaria = Conta("Maria",432)
    println("titular conta jo??o: ${contaJoao.titular}")
    println("titular conta Maria: ${contaMaria.titular}")

    println("n??mero X $numeroX")
    println("n??mero Y $numeroY")
}

fun testaLacos() {
    var i = 0;
    while (i < 5) {
        val titular: String = "Alex $i";
        val numeroConta: Int = 1000 + i;
        var saldo = i + 10.0;

        println("titular $titular");
        println("n??mero da conta $numeroConta");
        println("saldo da conta $saldo");
        println();
        i++;
    }
}

fun testaCondicoes(saldo: Double) {

    when {// no lugar do if
        saldo > 0.0 -> println("Conta ?? positiva")
        saldo == 0.0 -> println("Conta ?? Neutra")
        else -> println("Conta ?? negativa")
    }
}