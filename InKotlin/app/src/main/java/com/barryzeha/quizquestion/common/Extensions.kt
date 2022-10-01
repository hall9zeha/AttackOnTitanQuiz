package com.barryzeha.quizquestion.common

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.ContextThemeWrapper
import android.widget.Button
import android.widget.ImageView
import androidx.core.content.ContextCompat
import com.barryzeha.quizquestion.R
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.google.android.material.button.MaterialButton

/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 27/09/2022
 * Copyright (c)  All rights reserved.
 ***/


inline fun<reified  T: Activity> Context.intentFor(body: Intent.() -> Unit):Intent=
    Intent(this, T::class.java).apply(body)

inline fun <reified  T: Activity> Context.startActivity(body: Intent.()->Unit){
    startActivity(intentFor<T>(body))
}
fun ImageView.loadUrl(url:String){
    Glide.with(context).load(url)
        .diskCacheStrategy(DiskCacheStrategy.ALL)
        .placeholder(R.drawable.placeholder)
        .error(R.drawable.placeholder)
        .centerCrop()
        .into(this)
}
fun ImageView.loadUrl(res:Int){
    Glide.with(context).load(res)
        .diskCacheStrategy(DiskCacheStrategy.ALL)
        .centerCrop()
        .into(this)
}
fun Button.clear(){
       this.setBackgroundColor(ContextCompat.getColor(context,android.R.color.transparent))
}
fun Button.incorrectAnswer(buttonsArray:Array<Button>,answer:Int){
    this.setBackgroundColor(ContextCompat.getColor(context, R.color.red))
    buttonsArray[answer-1].setBackgroundColor(ContextCompat.getColor(context, R.color.green))

}

