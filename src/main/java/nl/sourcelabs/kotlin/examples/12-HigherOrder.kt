package nl.sourcelabs.kotlin.examples

// Execute function, executes the passed function the specified
// number of times
fun execute(times: Int = 1, function: () -> Unit) {
    for (i in 1..times) {
        function()
    }
}

// Function reference
val sum: (Int, Int) -> Int = { x, y -> x + y }

// Function that returns the square root for an int
val sqrt: (Int) -> Double = { Math.sqrt(it.toDouble()) }
// Function that calculates the power for an int
val pow: (Int) -> Int = { it * it }

// Calculates pythagorean theorem based on the size of the sides
val pythagoras: (Int, Int) -> Double = { a, b -> sqrt(pow(a) + pow(b)) }

fun main(args: Array<String>) {
    // Call the function defined in the sum value
    println(sum(40, 2))
    // Call the pythagoras function
    println(pythagoras(3, 4))

    // Function that takes a lambda as a parameter
    // Repeats the specified lambda (print(...)) the specified number of times
    execute(times = 2) {
        println("Lambda")
    }

    val function: () -> Unit = { println("Parameter") }

    execute(times = 2, function = function)
}