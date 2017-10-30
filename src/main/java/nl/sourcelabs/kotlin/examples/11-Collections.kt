package nl.sourcelabs.kotlin.examples

import java.util.stream.Collectors

// Lambda functions are supported too (java 8 style)
fun findEvens(list: List<Int>): List<Int> = list.stream()
        .filter { num -> num % 2 == 0 }
        .collect(Collectors.toList())

// We can also define this as an extension function (java 8 style)
fun Iterable<Int>.findEven(): List<Int> = this.toList()
        .stream()
        .filter { it % 2 == 0 }
        .collect (Collectors.toList())

// Kotlin defines good functionality for dealing with lists too
// No need for stream and collect - compact!
fun findEvensKotlin(list: List<Int>) = list.filter { it % 2 == 0 }

// Kotlin defines good (native) functionality for dealing with lists too
// These functions can be chained too.
fun countEvenNumbers(list: Iterable<Int>) = list.filter { it % 2 == 0 }.count()

// Find first even number
fun findFirstEven(list: Iterable<Int>) = list.first { it % 2 == 0 }
