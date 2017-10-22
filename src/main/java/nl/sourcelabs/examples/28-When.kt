package nl.sourcelabs.examples

fun isAdult(age: Int) = when(age) {
    in 0..18 -> false
    else -> true
}

fun ageGroup(age:Int) = when {
    age < 0 -> "Not Born Yet for at least ${Math.abs(age)} years"
    age in 0..1 -> "Baby"
    age in 1..4 -> "Toddler"
    age in 5..12 -> "Grade Schooler"
    age in 12..18 -> "Teen"
    age in 18..21 -> "Young Adult"
    age in 21..65 -> "Adult"
    age > 65 -> "Pensioner"
    else -> "Unknown age group"
}

fun main(args: Array<String>) {
    println(isAdult(12)) // false

    println(ageGroup(12)) // Grade Schooler
    println(ageGroup(42)) // Adult
    println(ageGroup(67)) // Pensioner
    println(ageGroup(-2)) // Not Born Yet for at least 2 years
}