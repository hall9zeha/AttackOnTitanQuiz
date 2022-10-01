package com.barryzeha.quizquestion.model

import androidx.room.Entity
import androidx.room.PrimaryKey


/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 27/09/2022
 * Copyright (c)  All rights reserved.
 ***/

@Entity(tableName = "ranking_table")
data class RankingModel (
    @PrimaryKey(autoGenerate = true)var id:Int=0,
    val name:String?="",
    val points:Int
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as RankingModel

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id
    }
}