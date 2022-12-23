import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaContasDiferentes(){
    val contaCorrente = ContaCorrente(

    Cliente(nome = "Alex", cpf = "",senha = 1 ),
    1000
)

val contaPoupanca = ContaPoupanca (
    Cliente(nome = "fran", cpf = "",senha = 2 ),
    1001
)

contaCorrente.deposita(1000.0)
contaPoupanca.deposita(1000.0)
    println("nome do titular ${contaCorrente.titular.nome}")
    println("cpf do titular ${contaCorrente.titular.cpf}")
println("Saldo modelo.Conta Corrente: ${contaCorrente.saldo}")
println("Saldo modelo.Conta Poupança: ${contaPoupanca.saldo}")

contaCorrente.saca(100.0)
contaPoupanca.saca(100.0)

println("Saldo após o saque modelo.Conta Corrente: ${contaCorrente.saldo}")
println("Saldo após o saque modelo.Conta Poupança: ${contaPoupanca.saldo}")

contaCorrente.transferencia(100.00,contaPoupanca)

println("Saldo após transferir modelo.Conta Corrente: ${contaCorrente.saldo}")
println("Saldo após transferir modelo.Conta Poupança: ${contaPoupanca.saldo}")

}