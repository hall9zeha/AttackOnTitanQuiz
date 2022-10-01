package com.barryzeha.quizquestion.di

import android.app.Application
import androidx.room.Room
import com.barryzeha.quizquestion.model.database.RankingDB
import com.barryzeha.quizquestion.model.repository.LocalDataSource
import com.barryzeha.quizquestion.model.repository.LocalDataSourceImpl
import com.barryzeha.quizquestion.model.repository.QuestionRepositoryImpl
import com.barryzeha.quizquestion.model.repository.QuestionsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 29/09/2022
 * Copyright (c)  All rights reserved.
 ***/
@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun databaseProvider(app:Application)=Room.databaseBuilder(app, RankingDB::class.java,"ranking_table").build()

    @Provides
    fun localDataSourceProvider(db:RankingDB):LocalDataSource=LocalDataSourceImpl(db)
    @Provides
    fun questionRepository():QuestionsRepository=QuestionRepositoryImpl()

}