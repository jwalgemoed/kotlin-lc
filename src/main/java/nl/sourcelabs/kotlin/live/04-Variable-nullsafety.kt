package nl.sourcelabs.kotlin.live

fun main(args: Array<String>) {
    val immutable: String? = null

    println(immutable?.toUpperCase()) // null
    println(immutable?.toUpperCase() ?: "Default")
    println(immutable!!.toUpperCase()) // NPE

}