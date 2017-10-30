package nl.sourcelabs.kotlin.examples

import java.net.URL

// Simple class defining an connection to a service
class ServerHost {
    var protocol: String = "http://"
    var host: String = "localhost"
    var port: Int = 8080

    override fun toString(): String {
        return "ServerHost(protocol='$protocol', host='$host', port=$port)"
    }
}

fun main(args: Array<String>) {
    // Useful for conversions and situations where the original instance can be null
    val toUrl = ServerHost().let {
        URL("${it.protocol}${it.host}:${it.port}")
    } // The result of the last statement is returned

    println(toUrl)

    // Builder-type construct, allows you to set properties on an instance an returns the instance
    val applyResult = ServerHost().apply {
        host = "192.168.0.1"
        port = 80
    } // Returns the instance apply is called on

    println(applyResult)

    // Block construct to bundle code in a block that does operations on the instance passed in
    val withResult = with(ServerHost()) {
        "$protocol$host:$port"
    }

    println(withResult)

    // This is similar to the with, but in this case returns not results
    "DoWithThis".run {
        println(this)
    }
}