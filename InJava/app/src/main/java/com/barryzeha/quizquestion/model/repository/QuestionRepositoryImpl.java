package com.barryzeha.quizquestion.model.repository;

import androidx.lifecycle.MutableLiveData;

import com.barryzeha.quizquestion.model.QuestionModel;

import java.util.HashSet;
import java.util.List;

/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 02/10/2022
 * Copyright (c)  All rights reserved.
 ***/
public class QuestionRepositoryImpl implements QuestionRepository{
    private final QuestionDataSource questionDataSource;
    public QuestionRepositoryImpl(QuestionDataSource questionDataSource){
        this.questionDataSource= questionDataSource;
    }
    private final MutableLiveData<QuestionModel> randomQuestion= new MutableLiveData<>();
    private int numQuestion=0;

    @Override
    public MutableLiveData<QuestionModel> getRandomQuestions(HashSet<Integer> randomSet) {
        List<QuestionModel> randomList= questionDataSource.generateRandomList(randomSet);
        randomQuestion.postValue(randomList.get(numQuestion));
        numQuestion++;
        return randomQuestion;
    }
}
