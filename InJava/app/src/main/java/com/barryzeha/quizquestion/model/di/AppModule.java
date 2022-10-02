package com.barryzeha.quizquestion.model.di;

import android.app.Application;

import androidx.room.Room;

import com.barryzeha.quizquestion.model.database.RankingDB;
import com.barryzeha.quizquestion.model.repository.QuestionRepository;
import com.barryzeha.quizquestion.model.repository.QuestionRepositoryImpl;
import com.barryzeha.quizquestion.model.repository.RankingDataSource;
import com.barryzeha.quizquestion.model.repository.RankingDataSourceImpl;
import com.barryzeha.quizquestion.model.repository.QuestionDataSource;
import com.barryzeha.quizquestion.model.repository.QuestionDataSourceImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 01/10/2022
 * Copyright (c)  All rights reserved.
 ***/
@Module
@InstallIn(SingletonComponent.class)
public class AppModule {
    @Provides
    @Singleton
    RankingDB databaseProvider(Application app){
        return Room.databaseBuilder(app, RankingDB.class,"ranking_table").build();
    }
    @Provides
    RankingDataSource localDataSourceProvider(RankingDB db) {return new RankingDataSourceImpl(db);}

    @Provides

    QuestionDataSource questionProvider(){ return new QuestionDataSourceImpl();}


}
