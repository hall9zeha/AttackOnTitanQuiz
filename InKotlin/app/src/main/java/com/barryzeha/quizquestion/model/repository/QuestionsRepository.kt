package com.barryzeha.quizquestion.model.repository

import androidx.lifecycle.MutableLiveData
import com.barryzeha.quizquestion.model.QuestionModel

/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 28/09/2022
 * Copyright (c)  All rights reserved.
 ***/
interface QuestionsRepository {
    fun getRandomQuestion(randomSet:HashSet<Int>):MutableLiveData<QuestionModel>
}