package com.barryzeha.quizquestion.model.repository

import androidx.lifecycle.MutableLiveData
import com.barryzeha.quizquestion.model.RankingModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 29/09/2022
 * Copyright (c)  All rights reserved.
 ***/
class RankingRepository(private val localDataSource: LocalDataSource) {
    private val rankingList=MutableLiveData<List<RankingModel>>()
    suspend fun saveRanking(ranking: RankingModel) {
        withContext(Dispatchers.IO){localDataSource.saveRanking(ranking)}
    }

    suspend  fun getRanking(): MutableLiveData<List<RankingModel>> = withContext(Dispatchers.IO) {
        rankingList.postValue(localDataSource.getRanking())
        return@withContext rankingList
    }
}