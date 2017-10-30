package nl.sourcelabs.kotlin.examples

// No ternary operator, so classic if/else
fun toYesNo(value: Boolean): String {
    if (value) {
        return "Yes"
    } else {
        return "No"
    }
}

// If is an expression, it can return a value. We can omit the separate return statements
fun toYesNoIfExpression(value: Boolean): String {
    return if (value) { // If is an expression
        "Yes"
    } else {
        "No"
    }
}

// We can structure the function as an expression, so no block
fun toYesNoExpressionFunction(value: Boolean): String = if (value) {
    "Yes"
} else {
    "No"
}

// We can specify the function as a oneliner too, leave of all the blocks
fun toYesNoExpressionFunctionNoBlock(value: Boolean): String = if (value) "Yes" else "No"

// Shortest way to represent this function, with the type inferred
fun toYesNoTypeInference(value: Boolean) = if (value) "Yes" else "No"