package com.barryzeha.quizquestion.model.di;

import com.barryzeha.quizquestion.model.repository.QuestionDataSource;
import com.barryzeha.quizquestion.model.repository.QuestionRepository;
import com.barryzeha.quizquestion.model.repository.QuestionRepositoryImpl;
import com.barryzeha.quizquestion.model.repository.RankingDataSource;
import com.barryzeha.quizquestion.model.repository.RankingDataSourceImpl;

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
public class DataModule {
    @Provides
    QuestionRepository questionRepositoryProvider(QuestionDataSource questionDataSource){
        return new QuestionRepositoryImpl(questionDataSource);
    }

}
