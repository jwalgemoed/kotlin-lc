package nl.sourcelabs.kotlin.live

interface Writer {
    fun write(str: String)
}

class ConsoleWriter: Writer {
    override fun write(str: String) {
        println(str)
    }
}

class UsesDelegate: Writer by ConsoleWriter()

fun main(args: Array<String>) {
    UsesDelegate().write("Bla")
}