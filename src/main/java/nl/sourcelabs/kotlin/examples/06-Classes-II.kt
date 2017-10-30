package nl.sourcelabs.kotlin.examples

// Classes are final by default - you cannot extend them. Unless you declare them open
// By default, ever class extends from the Any class. This is not the same as
// java.lang.object, it only defines equals(), hashCode() and toString()
open class Human(val name: String) : Any() // Any can be left off -- shown as example

// Extending a class is done by adding a colon and the class to extend behind it.
class Man(name: String) : Human(name)

// Kotlin Interface definition
interface AnInterface {
    fun aFunction()
}

// Implementing the interface is the same as extending a class
class AnImplementationOfAnInterface : AnInterface {
    // Functions need to be implemented. You are required to declare these with the override keyword
    override fun aFunction() {}
}



