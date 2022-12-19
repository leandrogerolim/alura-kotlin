import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {

    var numeroX = 10
    var numeroY = numeroX
    numeroY++

    val contaJoao = ContaCorrente("João", 558)

    var contaMaria = ContaPoupanca("Maria",432)
    println("titular conta joão: ${contaJoao.titular}")
    println("titular conta Maria: ${contaMaria.titular}")

    println("número X $numeroX")
    println("número Y $numeroY")
}
