package com.example.kotlinfundamentals

fun main() {
    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")

    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")

    val solarSystem = rockPlanets + gasPlanets

    solarSystem[3] = "Little Earth"

    val newSolarSystem = arrayOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")

    println(newSolarSystem[0])
    println(newSolarSystem[1])
    println(newSolarSystem[2])
    println(newSolarSystem[3])
    println(newSolarSystem[4])
    println(newSolarSystem[5])
    println(newSolarSystem[6])
    println(newSolarSystem[7])
    println(newSolarSystem[8])


    println("==========")

    val solarSystem1 = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

    println(solarSystem1.size)
    println(solarSystem1[2])
    println(solarSystem1.get(3))
    println(solarSystem1.indexOf("Earth"))
    println(solarSystem1.indexOf("Pluto"))


    println("==========")

    for (planet in solarSystem1) {
        println(planet)
    }

    println("==========")

    val solarSystem2 = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

    solarSystem2.add("Pluto")
    solarSystem2.add(3, "Theia")
    solarSystem2[3] = "Theia 1"
    println(solarSystem2.indexOf("Pluto"))


    println("==========")

    solarSystem2.removeAt(3)


    for (planet in solarSystem2) {
        println(planet)
    }

    println("==========")

    println(solarSystem2.contains("Pluto"))
    println("Future Moon" in solarSystem2)
}