fun testaComportamentosConta() {


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