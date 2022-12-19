fun testaCopiasEReferencias() {

    var numeroX = 10
    var numeroY = numeroX
    numeroY++

    val contaJoao = Conta("João", 558)

    var contaMaria = Conta("Maria",432)
    println("titular conta joão: ${contaJoao.titular}")
    println("titular conta Maria: ${contaMaria.titular}")

    println("número X $numeroX")
    println("número Y $numeroY")
}
