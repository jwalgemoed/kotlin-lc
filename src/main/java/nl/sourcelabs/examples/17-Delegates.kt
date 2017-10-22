package nl.sourcelabs.examples

// Given an interface with a couple of method
interface Writer {
    fun writeLine(value: String)
    fun write(value: String)
}

// And a possible implementation
class SystemOutWriter: Writer {
    override fun writeLine(value: String) {
        println(value)
    }

    override fun write(value: String) {
        println(value)
    }
}

// There's built-in support for delegation, so we can call functions
// of the Writer interface an delegate them to the specified implementation
class Delegate(writer: Writer): Writer by writer {
    fun useDelegate() {
        write("Hi")
    }
}

fun main(args: Array<String>) {
    Delegate(SystemOutWriter()).useDelegate()
}