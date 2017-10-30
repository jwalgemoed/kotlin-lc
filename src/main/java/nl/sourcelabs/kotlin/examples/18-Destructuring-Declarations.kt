package nl.sourcelabs.kotlin.examples

fun main(args: Array<String>) {
    // Given a pair (part of kotlin stdlib) with two constructor params
    val pair = Pair("first", "second")

    // We can destructure the declaration, defining the properties
    // we want to assign in order of declaration
    val (second, first) = pair

    // Watch out! The destructured declaration assigns in order of declaration on the class!!
    println(first) // second
    println(second) // first
}