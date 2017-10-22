package nl.sourcelabs.examples

// Function is not inlined, called dynamically
fun notInlined() {
    println("Not Inline")
}

// Inlined function, body of this function will be added inline on the call site
// Intellij adds warnings when inlining can be expensive - works best for lambda's
inline fun inlined() {
    println("Inline")
}

// Function code is inlined at the call site - this can improve performance
// because it prevents dynamic calls
inline fun inlinedFunction(function: () -> Int): Int {
    return function.invoke()
}

// If you look at the bytecode, you will see how the compiler inlines
// everything - making the calls more efficient
fun callInlinedFunction(): Int {
    return inlinedFunction { 5 }
}

// Use the decompiler feature to see how the compiler handles this
fun main(args: Array<String>) {
    notInlined() // Function call
    inlined() // The body for the inlined() function is inlined in the main method

    println(callInlinedFunction())
}