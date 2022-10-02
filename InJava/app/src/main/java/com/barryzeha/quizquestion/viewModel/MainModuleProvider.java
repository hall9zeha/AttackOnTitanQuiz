package com.barryzeha.quizquestion.viewModel;

import com.barryzeha.quizquestion.model.repository.QuestionRepository;
import com.barryzeha.quizquestion.model.repository.RankingDataSource;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.scopes.ViewModelScoped;

/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 02/10/2022
 * Copyright (c)  All rights reserved.
 ***/
@Module
@InstallIn(ViewModelComponent.class)
public class MainModuleProvider {
    @Provides
    @ViewModelScoped
    GetProviders getMainProviders(QuestionRepository questionRepository, RankingDataSource rankingDataSource){
        return new GetProviders(questionRepository,rankingDataSource);
    }
}
