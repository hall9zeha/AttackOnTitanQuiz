package com.barryzeha.quizquestion.viewModel;

import androidx.lifecycle.MutableLiveData;

import com.barryzeha.quizquestion.model.QuestionModel;
import com.barryzeha.quizquestion.model.RankingModel;
import com.barryzeha.quizquestion.model.repository.QuestionDataSource;
import com.barryzeha.quizquestion.model.repository.QuestionRepository;
import com.barryzeha.quizquestion.model.repository.RankingDataSource;

import java.util.HashSet;
import java.util.List;

/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 02/10/2022
 * Copyright (c)  All rights reserved.
 ***/
public class GetProviders {
    private final QuestionRepository questionRepository;
    private final RankingDataSource rankingDataSource;
    public GetProviders(QuestionRepository questionRepository, RankingDataSource rankingDataSource){
        this.questionRepository=questionRepository;
        this.rankingDataSource=rankingDataSource;
    }
    public void saveRanking(RankingModel ranking){rankingDataSource.saveRanking(ranking);}
    public void callRanking(){rankingDataSource.callRanking();}
    public MutableLiveData<List<RankingModel>> getRanking(){return rankingDataSource.getRanking();}
    public MutableLiveData<QuestionModel> getQuestionRandom(HashSet<Integer> randomSet){return questionRepository.getRandomQuestions(randomSet);}
}
