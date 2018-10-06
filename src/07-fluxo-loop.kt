fun main(args: Array<String>) {
    // For
    for (x in 1..10) {
        println(x)
    }

    // While
    var i = 1
    while (i < 10) {
        println(i)
        i++
    }

    // Do While
    var i2 = 1
    do {
        println(i2)
        i2++
    } while (i2 < 10)

    // For salteando números (step)
    val interval = 0..20
    for (x in interval step 2) {
        println(x)
    }

    // For com intervalo invertido
    for (x in 10 downTo 0) {
        println(x)
    }

}