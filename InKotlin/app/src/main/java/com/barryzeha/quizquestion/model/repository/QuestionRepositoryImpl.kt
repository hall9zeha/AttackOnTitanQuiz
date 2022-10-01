package com.barryzeha.quizquestion.model.repository

import androidx.lifecycle.MutableLiveData
import com.barryzeha.quizquestion.model.QuestionModel
import com.barryzeha.quizquestion.model.QuestionProvider

/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 28/09/2022
 * Copyright (c)  All rights reserved.
 ***/
class QuestionRepositoryImpl:QuestionsRepository {
    private val randomQuestion = MutableLiveData<QuestionModel>()
    private var questionNumber = 0
    override fun getRandomQuestion(randomSet:HashSet<Int>): MutableLiveData<QuestionModel> {
        val randomQuestionList = QuestionProvider.generateRandomList(randomSet)
        randomQuestion.postValue(randomQuestionList[questionNumber])
        questionNumber++
        return randomQuestion
    }
}