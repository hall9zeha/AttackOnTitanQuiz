package com.barryzeha.quizquestion.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 01/10/2022
 * Copyright (c)  All rights reserved.
 ***/
@Entity(tableName = "ranking_table")
public class RankingModel {
    @PrimaryKey(autoGenerate = true) private int id;
    private String namePlayer;
    private int points;

    public RankingModel(String namePlayer, int points){
        this.id=0;
        this.namePlayer= namePlayer;
        this.points=points;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
