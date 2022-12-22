import br.com.alura.bytebank.modelo.Conta
import br.com.alura.bytebank.modelo.Endereco


fun main() {

    println("Bem vindo ao Bytebank")
    val endereco = Endereco()

    println(Conta.total)
    val objeto: Any = Any()

    imprime(objeto)

    val teste: Any = imprime(endereco)
    println(teste)
}
    fun imprime(valor: Any) : Any{
        println(valor)
        return valor
}