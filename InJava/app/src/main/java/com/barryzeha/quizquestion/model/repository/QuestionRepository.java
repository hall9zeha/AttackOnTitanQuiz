package com.barryzeha.quizquestion.model.repository;

import androidx.lifecycle.MutableLiveData;

import com.barryzeha.quizquestion.model.QuestionModel;

import java.util.HashSet;

/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 02/10/2022
 * Copyright (c)  All rights reserved.
 ***/
public interface QuestionRepository {
     MutableLiveData<QuestionModel> getRandomQuestions(HashSet<Integer> randomSet);
}
