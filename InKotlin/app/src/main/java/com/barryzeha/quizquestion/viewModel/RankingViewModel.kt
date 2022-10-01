package com.barryzeha.quizquestion.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.barryzeha.quizquestion.model.RankingModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 28/09/2022
 * Copyright (c)  All rights reserved.
 ***/
@HiltViewModel
class RankingViewModel @Inject constructor(private val getResult: GetResult):ViewModel(){

    suspend fun getRanking(): MutableLiveData<List<RankingModel>> {
        return getResult.getRanking()
    }
    suspend fun saveRanking(ranking:RankingModel){
        getResult.saveRanking(ranking)
    }
}