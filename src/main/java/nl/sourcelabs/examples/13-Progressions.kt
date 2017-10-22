package nl.sourcelabs.examples

// Loop through range 2-10 iterating in steps of 2
fun range() {
    // Range from 2 to 10 (inclusive)
    for(num in 2..10 step 2) {
        print("$num ")
    }
    println()
}

fun until() {
    // Count up to 10 (not inclusive)
    for(num in 1 until 10) {
        print("$num ")
    }
    println()
}

fun countDown() {
    for(num in 10 downTo 1) {
        print("$num ")
    }
    println()
}

fun main(args: Array<String>) {
    range()
    countDown()
    until()
}