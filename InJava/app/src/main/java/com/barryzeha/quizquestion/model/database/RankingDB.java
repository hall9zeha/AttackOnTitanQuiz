package com.barryzeha.quizquestion.model.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.barryzeha.quizquestion.model.RankingModel;

/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 01/10/2022
 * Copyright (c)  All rights reserved.
 ***/
@Database(entities = {RankingModel.class}, version=1)
public abstract class RankingDB extends RoomDatabase {
    public abstract RankingDao rankingDao();
}
