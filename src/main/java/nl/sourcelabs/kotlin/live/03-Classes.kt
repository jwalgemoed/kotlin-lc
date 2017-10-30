package nl.sourcelabs.kotlin.live

open class Person

class Child: CanWalk, Person()

interface CanWalk

fun main(args: Array<String>) {
    val instance = Person()
}
