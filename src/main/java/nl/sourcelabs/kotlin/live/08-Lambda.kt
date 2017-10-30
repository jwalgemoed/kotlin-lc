package nl.sourcelabs.kotlin.live

import java.util.stream.Collectors

fun main(args: Array<String>) {
    val numbers = (1..20).toList()

    val evens = numbers.stream()
            .filter { it % 2 == 0 }
            .collect(Collectors.toList())

    val kotlinEvens = numbers
            .filter { it % 2 ==0 }

    println(evens)
}