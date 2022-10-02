package com.barryzeha.quizquestion.model;

/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 01/10/2022
 * Copyright (c)  All rights reserved.
 ***/
public class QuestionModel {
    private String question;
    private String url;
    private String answer1;
    private String answer2;
    private String answer3;
    private int correctAnswer;

    public QuestionModel(String question, String url, String answer1, String answer2, String answer3, int correctAnswer){
        this.question=question;
        this.url=url;
        this.answer1=answer1;
        this.answer2=answer2;
        this.answer3=answer3;
        this.correctAnswer=correctAnswer;
    }

    public void setQuestion(String question){
        this.question=question;
    }
    public void setUrl(String url){this.url=url;}
    public String getUrl(){return this.url;}
    public String getQuestion(){
        return this.question;
    }
    public void setAnswer1(String answer1){
        this.answer1= answer1;
    }
    public String getAnswer1(){
        return this.answer1;
    }
    public void setAnswer2(String answer2){
        this.answer2=answer2;
    }
    public String getAnswer2(){
        return this.answer2;
    }
    public void setAnswer3(String answer3){
        this.answer3=answer3;
    }
    public String getAnswer3(){
        return this.answer3;
    }
    public void setCorrectAnswer(int correctAnswer){
        this.correctAnswer= correctAnswer;
    }
    public int getCorrectAnswer(){
        return this.correctAnswer;
    }
}
