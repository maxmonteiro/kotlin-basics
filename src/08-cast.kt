fun main(args: Array<String>) {
    val number: Int = 10
    val longNumber: Long = 100

    var n1: Int
    // n1 = number
    // n1 = longNumber // Tipos incompatíveis entre n1 e longNumber

    // Convertendo long para int
    n1 = longNumber.toInt()
    // Convertendo long pra String
    println(longNumber.toString())

    // Convertendo string pra int
    val strNumber = "10"
    n1 = strNumber.toInt()

    // println trata os tipos de dados
    println(n1)
    // Na concatenação de string, a variável é sempre convertida como string
    println("Meu número é: $n1")
}