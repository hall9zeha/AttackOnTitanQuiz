package com.barryzeha.quizquestion.viewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.barryzeha.quizquestion.model.RankingModel;
import com.barryzeha.quizquestion.model.repository.RankingDataSource;

import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 02/10/2022
 * Copyright (c)  All rights reserved.
 ***/
@HiltViewModel
public class RankingViewModel extends ViewModel {
    private final GetProviders provider;
    @Inject
    public RankingViewModel(GetProviders getProviders){
        this.provider=getProviders;
    }

    public void saveRanking(RankingModel ranking){
        provider.saveRanking(ranking);
    }
    public void callRanking(){provider.callRanking();}
    public MutableLiveData<List<RankingModel>> getRanking(){
        return provider.getRanking();
    }
}
