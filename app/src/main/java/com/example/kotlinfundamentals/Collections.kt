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

    println("===== Set and MutableSet =====")

    // Set and MutableSet

    val solarSystemMS = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Neptune")

    println(solarSystemMS.size)

    solarSystemMS.add("Pluto")

    println(solarSystemMS.size)
    println(solarSystemMS.contains("Pluto"))
    println("Mercury" in solarSystemMS)

    solarSystemMS.remove("Pluto")
    println("Pluto" in solarSystemMS)


    println("===== Maps =====")

    // Maps

    val solarSystemMap = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 1,
        "Jupiter" to 2,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14,
        "Neptune" to 1 // number 1 will override number 14 of key "Neptune"
    )

    println(solarSystemMap.size)

    solarSystemMap["Pluto"] = 5

    println(solarSystemMap.size)

    println(solarSystemMap["Pluto"])

    println(solarSystemMap.get("Theia"))
    println(solarSystemMap.get("Neptune")) // Neptune key was overridden with value 1

    solarSystemMap.remove("Neptune")

    println(solarSystemMap.get("Neptune"))

    solarSystemMap.put("Mars", 4444)

    println(solarSystemMap.get("Mars"))

}