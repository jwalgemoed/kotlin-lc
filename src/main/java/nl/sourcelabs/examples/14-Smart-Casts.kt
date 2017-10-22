package nl.sourcelabs.examples

// This cast makes little sense -- but it shows the syntax
val regularCast: Number = 1 as Number

// Smart cast, after checking type the compiler will cast it automatically
// Inside the if, value is automatically cast to string
fun smartCastIf(value: Any) = if (value is String) {
    value.toUpperCase()
} else {
    ""
}

fun smartCastWhen(value: Any?) = when(value) {
    is String -> value.toUpperCase() // cast to string
    is Int -> (value * 2).toString() // cast to number
    null -> "NULL!!"
    else -> "?"
}

fun main(args: Array<String>) {
    println(smartCastIf("Hello!"))
    println(smartCastWhen(2)) // 4
    println(smartCastWhen("uppercase")) // UPPERCASE
    println(smartCastWhen(2.9)) // ?
    println(smartCastWhen(null)) // NULL!!
}