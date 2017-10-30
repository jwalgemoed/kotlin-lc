package nl.sourcelabs.kotlin.live

inline fun repeat(times: Int = 1, function: () -> Unit) {
    for(num in 1..times) {
        function()
    }
}

fun main(args: Array<String>) {
    repeat {
        println("Hi!")
    }
}