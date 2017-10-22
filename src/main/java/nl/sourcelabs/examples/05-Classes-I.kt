package nl.sourcelabs.examples

// Simplest shortest form for a class - no body required
class Minimal

// Create an instance - you can leave off the new keyword
val minimalInstance: Minimal = Minimal()



// Class with a constructor.
class Person (val name: String, val age: Int)

// Create an instance like we are used to doing, with parameters specified in order of declaration
val personInstance: Person = Person("Jarno", 37)

// We can also create an instance using named parameters - can be declared out of order too...
val personInstanceNamed: Person = Person(age = 37, name = "Jarno")




// Class with a default value in the constructor
class MagicNumber(val number: Int = 42)

// Create an instance without params, will use the default value for number
val magicNumberInstanceDefault: MagicNumber = MagicNumber()

// Create an instance and specify a value for number
val magicNumberInstanceSpecific: MagicNumber = MagicNumber(number = 3)