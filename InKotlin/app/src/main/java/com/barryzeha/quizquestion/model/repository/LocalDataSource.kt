package com.barryzeha.quizquestion.model.repository

import com.barryzeha.quizquestion.model.RankingModel

/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 28/09/2022
 * Copyright (c)  All rights reserved.
 ***/
interface LocalDataSource {
    suspend fun saveRanking(ranking:RankingModel)
    suspend fun getRanking():List<RankingModel>
}