package com.barryzeha.quizquestion.di

import com.barryzeha.quizquestion.model.repository.LocalDataSource
import com.barryzeha.quizquestion.model.repository.LocalDataSourceImpl
import com.barryzeha.quizquestion.model.repository.RankingRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 29/09/2022
 * Copyright (c)  All rights reserved.
 ***/
@Module
@InstallIn(SingletonComponent::class)
class DataModule {
    @Provides
    fun rankingRepositoryProvider(
        localRepository:LocalDataSource
    )=RankingRepository(localRepository)
}