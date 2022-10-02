package com.barryzeha.quizquestion.model.repository;

import androidx.lifecycle.MutableLiveData;

import com.barryzeha.quizquestion.model.RankingModel;

import java.util.List;

/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 01/10/2022
 * Copyright (c)  All rights reserved.
 ***/
public interface RankingDataSource {
    void saveRanking(RankingModel ranking);
    void callRanking();
    MutableLiveData<List<RankingModel>> getRanking();
}
