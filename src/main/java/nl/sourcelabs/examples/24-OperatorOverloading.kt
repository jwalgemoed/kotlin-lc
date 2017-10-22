package nl.sourcelabs.examples

data class Money(val currency: String, val value: Int) {
    // We can overload the plus operator
    operator fun plus(money: Money) = if (money.currency == this.currency) {
        Money(value = this.value + money.value, currency = this.currency)
    } else {
        throw IllegalArgumentException("Incompatible currency")
    }

    // Or minus
    operator fun minus(money: Money) = if (money.currency == this.currency) {
        Money(value = this.value - money.value, currency = this.currency)
    } else {
        throw IllegalArgumentException("Incompatible currency")
    }
}

fun main(args: Array<String>) {
    val tenEuro = Money(value = 10, currency = "€")
    val twoEuro = Money(value = 2, currency = "€")

    println(tenEuro + twoEuro) // Money(value=12, currency=€)
    println(tenEuro - twoEuro) // Money(value=8, currency=€)

    // Exception in thread "main" java.lang.IllegalArgumentException: Incompatible currency
    println(tenEuro - Money(value = 5, currency = "$"))
}