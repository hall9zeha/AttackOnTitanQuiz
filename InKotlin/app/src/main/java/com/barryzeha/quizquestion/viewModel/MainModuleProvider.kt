package com.barryzeha.quizquestion.viewModel

import androidx.lifecycle.viewmodel.ViewModelFactoryDsl
import com.barryzeha.quizquestion.model.repository.QuestionsRepository
import com.barryzeha.quizquestion.model.repository.RankingRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 29/09/2022
 * Copyright (c)  All rights reserved.
 ***/
@Module
@InstallIn(ViewModelComponent::class)
class MainModuleProvider {
    @Provides
    @ViewModelScoped
    fun getRankingProvider(
        repository:RankingRepository,
        questionsRepository: QuestionsRepository) = GetResult(repository, questionsRepository)
}