fun main(args: Array<String>) {
    // Concatenação
    val name = "Máximo " + "Henrique"
    val name2 = """
        Meu nome é
        Máximo Henrique
        teste
    """.trimIndent()
    val name3 = "Monteiro"

    println(name)
    println(name2)
    println("Olá $name3")

    // Para exibir um código na impressão, usa-se chave {}
    println("Olá, ${name3.length}")
    
}