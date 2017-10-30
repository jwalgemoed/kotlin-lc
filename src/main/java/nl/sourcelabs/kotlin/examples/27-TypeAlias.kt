package nl.sourcelabs.kotlin.examples

typealias Visits = Int
typealias Host = String

// Gives a bit more meaning to the declaration. Types are still String, Int
val visits: Map<Host, Visits> = mapOf("localhost" to 1)

// You can also define a typeAlias for a function
typealias FunctionType = (Int) -> Unit

fun withFunction(function: FunctionType) {
    function(1)
}

// Typealias with generics
typealias Predicate<T> = (T) -> Boolean

// Using the typealias
val predicate: Predicate<Int> = { it == 1 }