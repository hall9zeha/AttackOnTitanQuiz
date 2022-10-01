package com.barryzeha.quizquestion.model.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.barryzeha.quizquestion.R
import com.barryzeha.quizquestion.databinding.ItemRankingBinding
import com.barryzeha.quizquestion.model.RankingModel


/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 28/09/2022
 * Copyright (c)  All rights reserved.
 ***/

class RankingAdapter : RecyclerView.Adapter<RankingAdapter.ViewHolder>() {
    private var rankingList= arrayListOf<RankingModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        val bindView = ItemRankingBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(bindView.root)
    }

    override fun onBindViewHolder(holder:ViewHolder, position: Int) {
       holder.bind(rankingList[position])
        if(position==0){
            holder.bindView.ivWinner.setImageResource(R.drawable.ic_ranking)
        }
    }
    fun addRanking(list:List<RankingModel>){

        list.forEach {
            rankingList.add(it)
            notifyItemInserted(rankingList.size -1)
        }
    }
    override fun getItemCount(): Int = if (rankingList.size >0) rankingList.size else 0


     class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
         val bindView = ItemRankingBinding.bind(itemView)
        fun bind(ranking:RankingModel)=with(bindView){
            tvNamePlayer.text=ranking.name
            tvPoints.text= ranking.points.toString()

        }
    }
}