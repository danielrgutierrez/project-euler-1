package io.github.danielrgutierrez.projecteuler1

fun main(args: Array<String>) {
    val limit = if (args.size > 0) args[0].toInt() else 1000
    println(sumMultiplesOfThreeOrFiveLessThan(limit))
}

fun sumMultiplesOfThreeOrFiveLessThan(limit: Int) = (1..(limit - 1)).filter { it % 3 == 0 || it % 5 == 0 }.sum()
