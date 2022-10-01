package com.barryzeha.quizquestion.viewModel

import androidx.lifecycle.MutableLiveData
import com.barryzeha.quizquestion.model.QuestionModel
import com.barryzeha.quizquestion.model.RankingModel
import com.barryzeha.quizquestion.model.repository.QuestionsRepository
import com.barryzeha.quizquestion.model.repository.RankingRepository

/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 29/09/2022
 * Copyright (c)  All rights reserved.
 ***/
class GetResult(private val repository: RankingRepository, private val questionsRepository: QuestionsRepository) {
    suspend fun saveRanking(ranking: RankingModel){repository.saveRanking(ranking)}
    suspend fun getRanking():MutableLiveData<List<RankingModel>>{return repository.getRanking()}
    fun getRandomQuestion(randomSet:HashSet<Int>):MutableLiveData<QuestionModel>{
        return questionsRepository.getRandomQuestion(randomSet)
    }
}