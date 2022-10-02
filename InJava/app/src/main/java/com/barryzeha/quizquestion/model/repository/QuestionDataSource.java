package com.barryzeha.quizquestion.model.repository;

import com.barryzeha.quizquestion.model.QuestionModel;

import java.util.HashSet;
import java.util.List;

/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 02/10/2022
 * Copyright (c)  All rights reserved.
 ***/
public interface QuestionDataSource {
    List<QuestionModel> generateRandomList(HashSet<Integer> randomSet);
}
