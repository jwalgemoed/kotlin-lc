package nl.sourcelabs.examples

fun nullDeclarations() {

    // Immutable value that can be null, but not reassigned. Nullable types are identified
    // by the '?' symbol behind the name
    val nullableImmutable: Int? = null
    //  nullableImmutable = 10 // ERROR

    // Mutable, nullable value, that can be reassigned and null.
    var nullableMutable: Int? = null
    nullableMutable = 100 // Ok

}

fun nullSafeOperators() {
    val nullableString: String? = null

    // When dealing with possible nulls, use the null-safe operator ?. to prevent nullpointer exceptions
    println(nullableString?.toUpperCase()) // Prints null

    // When dealing with null values you can also provide a default value with the elvis operator
    println(nullableString?.toUpperCase() ?: "DEFAULT") // Prints DEFAULT

    // You can also use the !! operator, which will throw a NPE if the variable is null
    nullableString!!.toUpperCase() // throws NPE
}