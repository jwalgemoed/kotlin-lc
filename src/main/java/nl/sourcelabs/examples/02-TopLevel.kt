package nl.sourcelabs.examples

// Constants can be represented with the keyword 'const'. These can only exist on package level
const val HELLOWORLD_CONSTANT = "Hello World!"

// Variables can be top level
val helloWorld: String = HELLOWORLD_CONSTANT

fun helloWorld(): String {
    return helloWorld
}

fun main(args: Array<String>) {
    println(helloWorld())
}