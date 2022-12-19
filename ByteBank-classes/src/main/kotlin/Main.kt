fun main() {
    println("Bem vindo ao ByteBank")


    val alex = Funcionario(
        "leandro","222.555.444.77", 1300.00
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("Salario ${alex.salario}")
    println("Bonificação ${alex.bonificação()}")

}



