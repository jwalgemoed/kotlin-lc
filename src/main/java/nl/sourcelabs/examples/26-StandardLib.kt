package nl.sourcelabs.examples

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
    // Useful for conversions
    val toUrl = ServerHost().let {
        URL("${it.protocol}${it.host}:${it.port}")
    } // The result of the last statement is returned

    println(toUrl)

    val applyResult = ServerHost().apply {
        host = "192.168.0.1"
        port = 80
    } // Returns the instance apply is called on

    println(applyResult)

    val withResult = with(ServerHost()) {
        "$protocol$host:$port"
    }

    println(withResult)

    "DoWithThis".run {
        println(this)
    }
}