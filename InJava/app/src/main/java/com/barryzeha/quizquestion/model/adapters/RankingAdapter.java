package com.barryzeha.quizquestion.model.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.barryzeha.quizquestion.R;
import com.barryzeha.quizquestion.databinding.ItemRankingBinding;
import com.barryzeha.quizquestion.model.RankingModel;

import java.util.ArrayList;
import java.util.List;

/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 02/10/2022
 * Copyright (c)  All rights reserved.
 ***/
public class RankingAdapter extends RecyclerView.Adapter<RankingAdapter.ViewHolder> {
    private final List<RankingModel> listRanking=new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ranking,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(listRanking.get(position));

        if(position==0){
            holder.bind.ivWinner.setImageResource(R.drawable.ic_ranking);
        }
    }
    public void addRanking(List<RankingModel> listRankingDS){
        for(RankingModel ranking : listRankingDS){
            listRanking.add(ranking);
            notifyItemInserted(listRanking.size() -1);
        }
    }
    @Override
    public int getItemCount() {return listRanking.size();}

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ItemRankingBinding bind;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            bind=ItemRankingBinding.bind(itemView);
        }
        public void onBind(RankingModel ranking){
            bind.tvNamePlayer.setText(ranking.getNamePlayer());
            bind.tvPoints.setText(String.valueOf(ranking.getPoints()));
        }

    }
}
