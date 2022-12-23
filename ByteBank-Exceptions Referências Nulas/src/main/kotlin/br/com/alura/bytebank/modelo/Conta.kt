package br.com.alura.bytebank.modelo





abstract class Conta(
    val titular: Cliente,
    val numero: Int
) {
    //var titular = titular
    //var numero = numero //posso colocar a variavel diretamente no constructor.
    var saldo = 0.0
        protected set
    //constructor(titular: String, numero: Int){  //o construtor pode ser usado diretamente na classe sem dar problemas.
    //   this.titular = titular
    //    this.numero = numero
    companion object{
        var total = 0
        private set
    }
    init{
        println("Criando conta")
        total++
    }



    fun deposita(valor: Double) {
        if (valor > 0.0) {
            this.saldo += valor  //this.saldo do proprio objeto
        }
    }
    abstract fun saca(valor: Double)
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