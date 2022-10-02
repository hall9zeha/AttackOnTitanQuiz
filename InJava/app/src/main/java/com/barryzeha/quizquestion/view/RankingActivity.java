package com.barryzeha.quizquestion.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.barryzeha.quizquestion.R;
import com.barryzeha.quizquestion.databinding.ActivityRankingBinding;
import com.barryzeha.quizquestion.model.adapters.RankingAdapter;
import com.barryzeha.quizquestion.model.common.Util;
import com.barryzeha.quizquestion.viewModel.RankingViewModel;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class RankingActivity extends AppCompatActivity {
    private  ActivityRankingBinding bind;
    private RankingViewModel rankingViewModel;
    private RankingAdapter rankingAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind= ActivityRankingBinding.inflate(getLayoutInflater());
        Util.loadUrl(R.drawable.ranking_background,bind.ivBackgroundRanking,this);
        setContentView(bind.getRoot());
        
        setUpAdapter();
        setUpViewModel();
        bind.btnHome.setOnClickListener(v->{
            Intent intent = new Intent(this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });
    }

    private void setUpViewModel() {
        rankingViewModel= new ViewModelProvider(this).get(RankingViewModel.class);
        new Thread(() -> {
                rankingViewModel.callRanking();
       }).start();

        rankingViewModel.getRanking().observe(this,listRanking->{
            rankingAdapter.addRanking(listRanking);
        });
    }

    private void setUpAdapter() {
        rankingAdapter= new RankingAdapter();
        bind.rvRanking.setHasFixedSize(true);
        bind.rvRanking.setLayoutManager(new LinearLayoutManager(this));
        bind.rvRanking.setAdapter(rankingAdapter);
    }
}