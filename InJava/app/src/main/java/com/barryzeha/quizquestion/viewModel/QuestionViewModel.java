package com.barryzeha.quizquestion.viewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.barryzeha.quizquestion.model.QuestionModel;

import java.util.HashSet;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 02/10/2022
 * Copyright (c)  All rights reserved.
 ***/
@HiltViewModel
public class QuestionViewModel extends ViewModel {
    private final GetProviders provider;
    @Inject
    public QuestionViewModel(GetProviders getProviders){
        this.provider=getProviders;
    }

    public MutableLiveData<QuestionModel> getQuestionRandom(HashSet<Integer> randomSet){
        return provider.getQuestionRandom(randomSet);
    }
}
