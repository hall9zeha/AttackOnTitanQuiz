package com.barryzeha.quizquestion.model.repository

import com.barryzeha.quizquestion.model.RankingModel
import com.barryzeha.quizquestion.model.database.RankingDB
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 28/09/2022
 * Copyright (c)  All rights reserved.
 ***/
class LocalDataSourceImpl(db:RankingDB):LocalDataSource {
    private val rankingDao=db.rankingDAO()
    private var rankingList= listOf<RankingModel>()
    override suspend fun saveRanking(ranking: RankingModel) {
        withContext(Dispatchers.IO){rankingDao.saveRanking(ranking)}
    }

    override suspend fun getRanking(): List<RankingModel> = withContext(Dispatchers.IO) {
        rankingList=rankingDao.getRankings()
        return@withContext rankingList
    }

}