package nl.sourcelabs.examples

// We need to inline a function to be able to use reified generics
inline fun <reified T> reifiedGenerics(t: T) {
    // We can figure out the class of generic T by inlining the function and
    // using reified generics. This preserves the type info for the generic function
    println(T::class.java.name)
}

fun <T: Any> notReified(t: T) {
    // We can figure out the class of generic T by inlining the function and
    // using reified generics. This preserves the type info for the generic function
    println(t::class.java)
}

fun main(args: Array<String>) {
    reifiedGenerics("Hello") // prints java.lang.String
    reifiedGenerics(2) // prints java.lang.Integer
}