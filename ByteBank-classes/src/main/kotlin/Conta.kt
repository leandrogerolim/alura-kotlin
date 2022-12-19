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