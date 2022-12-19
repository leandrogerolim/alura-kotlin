fun main() {
    println("Bem vindo ao ByteBank")


    val alex = Funcionario(
        "leandro", "222.555.444.77", 1300.00
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("Salario ${alex.salario}")
    println("Bonificação ${alex.bonificacao()}")


    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )
    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificação ${fran.bonificacao()}")

    if (fran.autentica(1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autentição")
    }

    val leandro = Diretor(
        "Leandro",
        "555.555.555.87",
        4000.00,
        4000,
        200.00
    )
    println("nome ${leandro.nome}")
    println("cpf ${leandro.cpf}")
    println("salario ${leandro.salario}")
    println("bonificação ${leandro.bonificacao()}")

    if (leandro.autentica(4000)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autentição")
    }

}
