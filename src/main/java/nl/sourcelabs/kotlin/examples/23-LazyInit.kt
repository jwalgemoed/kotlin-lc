package nl.sourcelabs.kotlin.examples

import kotlin.LazyThreadSafetyMode.NONE
import kotlin.LazyThreadSafetyMode.PUBLICATION

// Lazy initialized value - will be initialized when it is first accessed
// Default implmentation is synchronized, uses a lock
val lazyInit: String by lazy {
    println("INIT")
    "Hello Lazy"
}

// No lock, but the first available value will be returned
val lazyInitPublication: String by lazy(PUBLICATION) {
    println("INIT")
    "Hello Lazy"
}

// None -- meaning no locks and therefor undefined behavior
val lazyInitNone: String by lazy(NONE) {
    println("INIT")
    "Hello Lazy"
}

// This is not lazy, so it will be run first
val notLazy: String = "Hi".apply {
    println(this)
}

fun main(args: Array<String>) {
    println(lazyInit) // Prints Hi INIT Hello Lazy
}