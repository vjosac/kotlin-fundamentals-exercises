package com.example.kotlinfundamentals

fun main() {
    val question1 = Question("Quoth the raven ___", "nevermore", "medium")
    val question2 = Question("The sky is green. True or false?", false, "easy")
    val question3 = Question("How many days are there between full moons?", 28, "hard")

    println("QUIZ 1:")
    println("First Question: ${question1.questionText} ------- difficulty: ${question1.difficulty}")
    println("Answer: ${question1.answer}")
    println("==================================================")
    println("")
    println("Second Question: ${question2.questionText} ------- difficulty: ${question2.difficulty}")
    println("Answer: ${question2.answer}")
    println("==================================================")
    println("")
    println("Third Question: ${question3.questionText} ------- difficulty: ${question3.difficulty}")
    println("Answer: ${question3.answer}")
}


class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: String
)