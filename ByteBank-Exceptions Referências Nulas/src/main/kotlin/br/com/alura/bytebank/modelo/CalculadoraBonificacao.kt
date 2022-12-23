package br.com.alura.bytebank.modelo

class CalculadoraBonificacao {
    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario){

        this.total += funcionario.bonificacao
    }
//    fun registra(funcionario: modelo.Gerente) {
//        this.total += funcionario.bonificacao
//    }
//
//    fun registra(funcionario: modelo.Diretor) {
//        this.total += funcionario.bonificacao
//    }

}