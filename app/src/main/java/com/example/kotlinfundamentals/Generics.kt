package com.example.kotlinfundamentals

fun main() {
    val question1 = Question("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question("The sky is green. True or false?", false, Difficulty.EASY)
    val question3 = Question("How many days are there between full moons?", 28, Difficulty.HARD)

    println("QUIZ 1:")
    println("First $question1")
    println("==================================================")
    println("")
    println("Second $question2")
    println("==================================================")
    println("")
    println("Third $question3")
}


data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

enum class Difficulty {
    EASY, MEDIUM, HARD
}