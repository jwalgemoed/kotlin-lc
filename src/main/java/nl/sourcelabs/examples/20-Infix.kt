package nl.sourcelabs.examples

// Infix function that can be called to add two ints together
infix fun Int.plus(that: Int) = this + that

fun main(args: Array<String>) {
    // You can call this using function notation
    println(1.plus(2).plus(3))
    // You can call it in infix notation
    println(1 plus 2 plus 3)

    // The Kotlin stdlib defines these functions to create a Pair too
    val pair = "key" to "value"
    println(pair)
}
