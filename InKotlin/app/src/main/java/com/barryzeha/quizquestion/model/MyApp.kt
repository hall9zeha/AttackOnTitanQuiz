package com.barryzeha.quizquestion.model

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 27/09/2022
 * Copyright (c)  All rights reserved.
 ***/
@HiltAndroidApp
class MyApp:Application() {
    override fun onCreate() {
        super.onCreate()
    }
}