package nl.sourcelabs.kotlin.examples

// Same as a regular class but with predefined toString, equals, hashcode and copy
data class Car(val make: String, val model: String)

// Usage of data classes is very convenient
fun main(args: Array<String>) {
    val instance = Car(make = "Audi", model = "A3")
    println(instance.toString()) // Car(make=Audi, model=A3)

    val exactCopy = instance.copy()
    println(instance == exactCopy) // true -- Equal
    println(instance === exactCopy) // false -- But not the same reference

    val alteredCopy = instance.copy(model = "A4")
    println(instance == alteredCopy) // true -- Not equal
    println(alteredCopy) // Car(make=Audi, model=A4)
}