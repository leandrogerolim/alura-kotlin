package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Autenticavel

class Cliente(
    var nome: String,
    val cpf: String,
    protected val senha: Int
): Autenticavel {


    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false


    }
}
