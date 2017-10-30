package nl.sourcelabs.kotlin.live

import java.util.*

// Function to convert a boolean value to yes/no
fun Boolean.convertToYesNo() = if(this) "Yes" else "No"

val Boolean.yesNo
    get() = if(this) "Yes" else "No"

fun main(args: Array<String>) {
    println(true.yesNo)
}