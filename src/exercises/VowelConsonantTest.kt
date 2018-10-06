package exercises

import org.junit.Assert
import org.junit.Test

// Crie uma função que retorne a quantidade de vogais e consoantes presentes numa string
class VowelConsonantTest {
    @Test
    fun countVowels() {
        // Este teste executa a função de contar as vogais e verifica se o valor informado
        // no caso 6, é igual ao retornado pela função
        Assert.assertEquals(7, countVowels("Maximo Henrique"))
    }

    @Test
    fun countConsonants() {
        Assert.assertEquals(7, countConsonants("Maximo Henrique"))
    }

    @Test
    fun countVowelsConsonants() {
        val phrase = "Desenvolvimento em kotlin"
        Assert.assertEquals(9, countVowels(phrase))
        Assert.assertEquals(14, countConsonants(phrase))
    }
}