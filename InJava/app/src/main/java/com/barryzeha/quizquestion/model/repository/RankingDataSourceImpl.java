package com.barryzeha.quizquestion.model.repository;

import androidx.lifecycle.MutableLiveData;

import com.barryzeha.quizquestion.model.RankingModel;
import com.barryzeha.quizquestion.model.database.RankingDB;
import com.barryzeha.quizquestion.model.database.RankingDao;

import java.util.List;

/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 01/10/2022
 * Copyright (c)  All rights reserved.
 ***/
public class RankingDataSourceImpl implements RankingDataSource {
    private final  RankingDao rankingDao;
    private final MutableLiveData<List<RankingModel>> rankingList= new MutableLiveData<>();
    public RankingDataSourceImpl(RankingDB db) {
        this.rankingDao=  db.rankingDao();
    }

    @Override
    public void saveRanking(RankingModel ranking) {
        rankingDao.saveRanking(ranking);
    }

    @Override
    public void callRanking() {
        rankingList.postValue(rankingDao.getRanking());
    }

    @Override
    public MutableLiveData<List<RankingModel>> getRanking() {
        return rankingList;
    }
}
