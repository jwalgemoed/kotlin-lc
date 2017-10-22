package nl.sourcelabs.examples

data class Color(val name: String)

fun main(args: Array<String>) {
    val red = Color("Red")
    val alsoRed = Color("Red")

    println(red.equals(alsoRed)) // True -- equal
    println(red == alsoRed) // True -- equal (== is operator overloaded function that calls equals)
    println(red === alsoRed) // false -- Compares reference equality (java ==)
}