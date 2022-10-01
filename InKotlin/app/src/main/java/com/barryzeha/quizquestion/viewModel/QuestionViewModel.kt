package com.barryzeha.quizquestion.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.barryzeha.quizquestion.model.QuestionModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 28/09/2022
 * Copyright (c)  All rights reserved.
 ***/
@HiltViewModel
class QuestionViewModel @Inject constructor(private val getResult: GetResult):ViewModel() {
    //private val repositoryQuestion:QuestionsRepository = QuestionRepositoryImpl()
    fun getRandomQuestion(randomSet:HashSet<Int>):MutableLiveData<QuestionModel>{
        return getResult.getRandomQuestion(randomSet)
    }
}