package nl.sourcelabs.kotlin.examples

// Class with property declarations. Arguments/propertys with the val or var keyword are automatically added as members
// NotAProperty is just a constructor parameter, it will not be exposed as a property
// The visibility of these member properties is determined by the visibility modifier
class WithProperties(private val immutable: String, public var mutable: String, notAProperty: String) {

    // Property declaration, using the notAProperty argument in uppercase to specify its value
    public val localImmutableProperty: String = notAProperty.toUpperCase() // Use constructor parameters

    public var localMutableProperty: String = "Local Property"
        get() = field // Define a custom getter
        set(value) {
            if (value.isNotEmpty()) {
                field = value
            }
        }
}

fun main(args: Array<String>) {
    val withPropertys: WithProperties = WithProperties("VALUE", "VARIABLE", "transient")

    // Getters and setters are not explicit, in Kotlin property access is used
    // println(withPropertys.immutable) // ERROR not visible
    println(withPropertys.mutable)
    println(withPropertys.localMutableProperty)
    println(withPropertys.localImmutableProperty)

    withPropertys.mutable = ""
    //    withPropertys.localImmutableProperty = "" // ERROR - Final property
}
