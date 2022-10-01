package com.barryzeha.quizquestion.model

data class QuestionModel(
    val question: String,
    val url: String,
    val answer1: String,
    val answer2: String,
    val answer3: String,
    val correctAnswer: Int
)