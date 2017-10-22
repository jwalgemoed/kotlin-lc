package nl.sourcelabs.examples

// Built-in singleton classes
object ThereCanBeOnlyOne {
    val singletonProperty = "Hi!"
}

// Access the class like you would a static class
fun main(args: Array<String>) {
    println(ThereCanBeOnlyOne.singletonProperty) // Hi!
}