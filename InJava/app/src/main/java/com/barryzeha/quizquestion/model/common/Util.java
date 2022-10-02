package com.barryzeha.quizquestion.model.common;

import android.content.Context;
import android.widget.ImageView;

import com.barryzeha.quizquestion.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 02/10/2022
 * Copyright (c)  All rights reserved.
 ***/
public class Util {
    public static void loadUrl(String url, ImageView imageView, Context ctx){
        Glide.with(ctx)
                .load(url)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.placeholder)
                .into(imageView);
    }
    public static void loadUrl(int res,ImageView imageView, Context ctx){
        Glide.with(ctx)
                .load(res)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .into(imageView);
    }
}
