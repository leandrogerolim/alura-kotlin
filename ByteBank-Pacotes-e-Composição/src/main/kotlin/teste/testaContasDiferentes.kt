import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaContasDiferentes(){
    val contaCorrente = ContaCorrente(

    "Alex",
    1000
)

val contaPoupanca = ContaPoupanca (
    "fran",
    1001
)

contaCorrente.deposita(1000.0)
contaPoupanca.deposita(1000.0)

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