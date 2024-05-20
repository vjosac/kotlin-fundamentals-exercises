package com.example.kotlinfundamentals

fun main() {
    cookies.forEach {
        println("Menu item: ${it.name}")
    }

    val fullMenu = cookies.map {
        "${it.name} - $${it.price}"
    }

    println("\nFull menu:")
    fullMenu.forEach {
        println(it)
    }

    val softBakedMenu = cookies.filter {
        it.softBaked
    }


    println("\nSoft baked menu:")
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }


    val groupedMenu = cookies.groupBy {
        it.softBaked
    }


    println(groupedMenu.size)

    val softBakedMenu1 = groupedMenu[true] ?: listOf()
    val crunchyMenu = groupedMenu[false] ?: listOf()

    println()
    println("===========")
    println("Soft cookies:")
    softBakedMenu1.forEach {
        println("${it.name} - $${it.price}")
    }

    println()
    println("===========")
    println("Crunchy cookies:")
    crunchyMenu.forEach {
        println("${it.name} - $${it.price}")
    }


    println()
    val totalPrice = cookies.fold(0.0) {total, cookie ->
        total + cookie.price
    }

    println("Total price: $${totalPrice}")

    println()
    val alphabeticalMenu = cookies.sortedBy {
        it.name
    }

    println("Alphabetical menu:")
    alphabeticalMenu.forEach {
        println(it.name)
    }
}

class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)


val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Cream",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)