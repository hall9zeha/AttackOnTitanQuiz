package com.barryzeha.quizquestion.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

import com.barryzeha.quizquestion.R;
import com.barryzeha.quizquestion.databinding.ActivityScoreBinding;
import com.barryzeha.quizquestion.model.RankingModel;
import com.barryzeha.quizquestion.model.common.Constants;
import com.barryzeha.quizquestion.model.common.Util;
import com.barryzeha.quizquestion.viewModel.RankingViewModel;

import java.util.Objects;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class ScoreActivity extends AppCompatActivity {
    private RankingViewModel rankingViewModel= null;
    private int totalPoints=0;
    private ActivityScoreBinding bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind=ActivityScoreBinding.inflate(getLayoutInflater());
        Util.loadUrl(R.drawable.question_background,bind.ivScoreBackground,this);
        setContentView(bind.getRoot());

        totalPoints=getIntent().getExtras().getInt(Constants.POINTS_EXTRAS);
        setUpViewModel();
        populateScoreInfo();
        setUpListeners();
    }

    private void setUpViewModel() {
        rankingViewModel = new ViewModelProvider(this).get(RankingViewModel.class);
    }

    private void populateScoreInfo() {
        if(totalPoints!=0){
            bind.tvPoints.setText(String.valueOf(totalPoints));
           if(totalPoints >=200 && totalPoints <=300){
                bind.tvScore.setText(getString(R.string.scoreMaxMsg));
           }
           else if(totalPoints >=150 && totalPoints <=200){
               bind.tvScore.setText(getString(R.string.scoreMediumMsg));
           }
           else{
                bind.tvScore.setText(getString(R.string.lowScoreMsg));
           }
        }
    }
    private void setUpListeners(){
        bind.btnExit.setOnClickListener(v->{
            Intent intent = new Intent(this,MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });
        bind.btnSave.setOnClickListener(v->{
            if(bind.edtPlayer.getText().toString().isEmpty()){
                Toast.makeText(this, getString(R.string.writeYouName), Toast.LENGTH_SHORT).show();
            }
            else{
                saveRanking(bind.edtPlayer.getText().toString(),totalPoints);
               }
        });
    }
    private void saveRanking(String namePlayer, int points){
        try{
            Thread  thread = new Thread(() -> rankingViewModel.saveRanking(new RankingModel(namePlayer,points)));
            thread.start();
           Toast.makeText(this, getString(R.string.savedScore), Toast.LENGTH_SHORT).show();
           goToRanking();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    private void goToRanking(){
        bind.edtPlayer.setText("");
        bind.btnSave.setEnabled(false);
        bind.btnExit.setEnabled(false);
        Intent intent = new Intent(ScoreActivity.this, RankingActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);

        new Handler(Looper.getMainLooper()).postDelayed(() -> startActivity(intent),1000);
    }

    @Override
    public void onBackPressed() {}
}