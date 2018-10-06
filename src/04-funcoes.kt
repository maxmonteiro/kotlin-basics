// Declaramos a função
fun hello() {
    print("Hello")
}

// Função com parâmetro, exige retorno
fun toUpper(str: String): String {
    return str.toUpperCase()
}

fun main(args: Array<String>) {
    // Fazemos a chamada da função
    hello()
    println(toUpper("máXimo"))
}