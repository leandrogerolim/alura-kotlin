package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Conta

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular,
    numero
) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }
}