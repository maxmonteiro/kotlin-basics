import java.lang.Exception
import java.lang.NullPointerException

fun main(args: Array<String>) {
    /* Tratando erros */

    // "asdaf".toInt() // Ao executar ocasiona o erro NumberFormatException
    // Tratamos erros usando try catch
    // sintaxe:
    // try {
    //
    // } catch () {
    //
    // }
    /*try {
        var number = "asdaf".toInt()
    } catch (e: NumberFormatException) {
        println("Não é um número")
    }*/

    // Podemos ter vários catches tratando vários erros
    try {
        var number = "asfag".toInt()
    } catch (e: NullPointerException) {
        println("Null pointer")
    } catch (e: NumberFormatException) {
        println("Não é um número")
    } catch (e: Exception) {
        println("Não sei o que aconteceu!!")
    } finally { // Finally é executado independente de erros ou não, ou seja, sempre é executado
        println("Finalmente!")
    }

}