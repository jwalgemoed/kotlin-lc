package nl.sourcelabs.kotlin.live

data class Money (val currency: String, val amount: Double) {
    operator fun plus(that: Money) = Money(amount = this.amount + that.amount, currency = this.currency)
}

fun main(args: Array<String>) {
    val money = Money("$", 1.0)
    val money2 = Money(amount = 1.0, currency = "$")

    val total = money.plus(money2)

    println(total)
}
