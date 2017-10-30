package nl.sourcelabs.kotlin.examples

// Function toYesNo added to the Boolean class
// Declare <ClassToExtend>.<functionName>
// The this keyword represents the class this function is called on
fun Boolean.toYesNo() = if (this) "Yes" else "No"

// Even shorter, would be to define an extension property
val Boolean.yesno: String
    get() = if (this) "Yes" else "No"

fun main(args: Array<String>) {
    // Now we can call it on booleans directly
    val nullBool: Boolean? = null
    println(true.toYesNo())
    println(nullBool.toYesNoNull())

    // Access the extension property as if it was part of the original type
    println(true.yesno)
}

// Extension functions that can deal with null values
// This is declared by using the ?. before the function name
fun Boolean?.toYesNoNull() = when (this) {
    true -> "Yes"
    false, null -> "No"
}