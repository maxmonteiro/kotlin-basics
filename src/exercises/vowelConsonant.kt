package exercises

fun countVowels(phrase: String): Int {
    // Declaramos uma constante com as vogais para comparação
    val vowels = "aeiou"
    // Declaramos um contador a ser incrementado para cada vogal encontrada na string
    var totalVowels = 0

    // Percorremos cada letra da string
    for (letter in phrase) {
        // Se a letra estiver na constante das vogais, incrementados o contador de vogais
        if (letter.toLowerCase() in vowels) totalVowels++
    }
    // Retornamos o contador de vogais
    return totalVowels
}

// Semelhante à função anterior
fun countConsonants(phrase: String): Int {
    val consonants = "bcdfghjlkmnpqrstvwxyz"
    var totalConsonants = 0

    for (letter in phrase) {
        if (letter.toLowerCase() in consonants) totalConsonants++
    }
    // Retornamos o contador de consoantes
    return totalConsonants
}