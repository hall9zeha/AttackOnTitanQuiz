package com.barryzeha.quizquestion.model.database

import androidx.room.*
import com.barryzeha.quizquestion.model.RankingModel


/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 27/09/2022
 * Copyright (c)  All rights reserved.
 ***/
@Dao
interface RankingDAO {
@Insert(onConflict = OnConflictStrategy.REPLACE)
fun saveRanking(ranking: RankingModel)
@Query("select  * from ranking_table order by points desc")
fun getRankings():MutableList<RankingModel>

}