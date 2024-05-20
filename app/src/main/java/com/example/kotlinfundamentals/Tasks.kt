package com.example.kotlinfundamentals

fun main() {

    // Task 1
    val event = Event("Study Kotlin", "Commit to studying Kotlin at least 15 minutes per day.", DayPart.EVENING, 15)
    println(event)

    // Task 2
    val event1 = Event(title = "Wake up", description = "Time to get up", dayPart = DayPart.MORNING, duration = 0)
    val event2 = Event(title = "Eat breakfast", dayPart = DayPart.MORNING, duration = 15)
    val event3 = Event(title = "Learn about Kotlin", dayPart = DayPart.AFTERNOON, duration = 30)
    val event4 = Event(title = "Practice Compose", dayPart = DayPart.AFTERNOON, duration = 60)
    val event5 = Event(title = "Watch latest DevBytes video", dayPart = DayPart.AFTERNOON, duration = 10)
    val event6 = Event(title = "Check out latest Android Jetpack library", dayPart = DayPart.EVENING, duration = 45)

    // Task 3
    val events = mutableListOf<Event>(event1, event2, event3, event4, event5, event6)

    // Task 4
    println()
    val shortEvents = events.filter {
        it.duration < 60
    }
    println("You have ${shortEvents.size} short events.")

    println("The short events are: ")
    shortEvents.forEach {
        println("Event title = ${it.title}, duration = ${it.duration}")
    }

    // Task 5
    println()
    val groupedEvents = events.groupBy {
        it.dayPart
    }

    groupedEvents.forEach { (dayPart, events) ->
        println("$dayPart: ${events.size} events")
    }

    // Task 6
    println()
    println("Last event of the day: ${events.last().title}")


    // Task 7
    println()
    val durationOfEvent = if (events[0].duration < 60) {
        "short"
    } else {
        "long"
    }
    println("Duration of first event of the day: $durationOfEvent")

    // solution
    println("Duration of first event of the day: ${events[0].durationOfEvent}")

}

enum class DayPart {
    MORNING,
    AFTERNOON,
    EVENING
}

data class Event(
    val title: String,
    val description: String? = null,
    val dayPart: DayPart,
    val duration: Int
) {
    override fun toString(): String {
        return "Event(title=$title, description=$description, dayPart=$dayPart, duration=$duration)"
    }

    val durationOfEvent: String
        get() = if (this.duration < 60) {
            "short"
        } else {
            "long"
        }
}