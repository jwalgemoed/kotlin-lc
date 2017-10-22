package nl.sourcelabs.examples

import java.net.URL

// Lambda with receiver function. Defined similarly to regular lambda's
// but note the receiver - UrlBuilder.() which means the provided function can only
// on an instance of type UrlBuilder. In this case, this syntax allows us to create
// a builder instance, pass it to the receiver lambda in which the user can call methods on it
// or access variables. After completing the execution of the receiver function we can then
// call the build method on the result.
inline fun url(receiver: UrlBuilder.() -> Unit): URL {
    val builder = UrlBuilder()
    builder.receiver()
    return builder.build()
}

// Builder class
class UrlBuilder {
    // Settable properties
    var protocol = "http://"
    var host = "127.0.0.1"
    var port = 80

    // Internal instance of a nested builder class
    private var pathBuilder = PathBuilder()

    // Another lambda with receiver class, this time for the pathbuilder
    // so the user can set values on this class
    fun pathBuilder(receiver: PathBuilder.() -> Unit) {
        pathBuilder.receiver()
    }

    // Build method, creating a URL from the specified properties (naive)
    fun build(): URL {
        return URL("$protocol$host:$port${pathBuilder.path}${pathBuilder.params}")
    }

    // Structural definition of the pathbuilder
    inner class PathBuilder {
        var path = "/"
        var params = ""
    }
}

// Main method using this receiver lambda to write DSL style logic
fun main(args: Array<String>) {
    // Property definition, return type is URL (after building)
    val url: URL = url {
        protocol = "https://"
        host = "www.google.com"
        pathBuilder {
            path = "/search"
            params = "?q=Kotlin"
        }
    }
    println(url) // https://www.google.com:80/search?q=Kotlin
}