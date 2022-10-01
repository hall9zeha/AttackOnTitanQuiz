package com.barryzeha.quizquestion.model.database

import androidx.room.*
import androidx.room.RoomDatabase
import com.barryzeha.quizquestion.model.RankingModel

/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 27/09/2022
 * Copyright (c)  All rights reserved.
 ***/
@Database(entities = [RankingModel::class], version = 1)
abstract class RankingDB :RoomDatabase(){
    abstract fun rankingDAO(): RankingDAO
}