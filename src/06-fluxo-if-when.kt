import java.util.*

/*fun whatHappened(year: Int): String {
    if (year == 2018)
        return "Ano atual"
    else if (year == 2019)
        return "Ano que vem"
    else
        return "Não sei"
}
// Ou
fun whatHappened(year: Int) =
    if (year == 2018)
        "Ano atual"
    else if (year == 2019)
        "Ano que vem"
    else
        "Não sei"
*/

/*fun whatHappened(year: Int): String {

    when (year) {
        2018 -> {
            return "Ano atual"
        }
        2019, 2020, 2021 -> return "Próximos anos"
        else -> return "Não sei"
    }
}*/
// Ou
fun whatHappened(year: Int) = when (year) {
    2018 -> {
        "Ano atual"
    }
    2019, 2020, 2021 -> "Próximos anos"
    else -> "Não sei"
}

// O when não necessita necessariamente de uma variável
// a verificação pode ser feita através de expressões
/*fun whatHappened(year: Int): String {

    when {
        year == 2018 -> return "Ano atual"
    }
}*/


fun main(args: Array<String>) {

    val calendar: Calendar = Calendar.getInstance()
    val year = calendar.get(Calendar.YEAR)
    // Executando a função
    println(whatHappened(2018))
}