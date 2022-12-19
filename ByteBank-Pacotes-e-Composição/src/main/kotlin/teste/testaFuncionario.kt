import modelo.Analista
import modelo.CalculadoraBonificacao
import modelo.Diretor
import modelo.Gerente

fun testaFuncionarios(){

    val alex = Analista(
        "leandro", "222.555.444.77", 1300.00
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("Salario ${alex.salario}")
    println("Bonificação ${alex.bonificacao}")


    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )
    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificação ${fran.bonificacao}")

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
    println("bonificação ${leandro.bonificacao}")

    if (leandro.autentica(4000)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autentição")
    }
    val maria = Analista("Maria","555.77.888.77",3000.00)
    val calculadora = CalculadoraBonificacao()

    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(leandro)
    calculadora.registra(maria)

    println("Bonificação Total: ${calculadora.total}")



}
