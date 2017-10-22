package nl.sourcelabs.examples

// Immutable values are defined with keyword val - cannot be reassigned
val immutable: Int = 42

// Mutable values are defined with keyword var - can be reassigned
var mutable: Int = 42

fun main(args: Array<String>) {
    // immutable = 3 // Error!
    mutable = 3 // Ok
}
