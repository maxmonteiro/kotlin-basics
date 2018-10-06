// Função em uma linha
fun hello2() = print("Hello")

// Função em uma linha não necessita return
fun toUpper2(str: String) = str.toUpperCase()

// Ex: Função que verifica qual número é maior
/*fun whichNumberIsBigger(n1: Int, n2: Int): Int {
    if (n1 > n2)
        return n1
    else
        return n2
}*/
fun whichNumberIsBigger(n1: Int, n2: Int): Int = if (n1 > n2) n1 else n2

fun main(args: Array<String>) {
    // Fazemos a chamada da função
    hello2()
    println(toUpper2("máXimo"))
}