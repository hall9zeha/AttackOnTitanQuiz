package com.barryzeha.quizquestion.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.activity.viewModels
import com.barryzeha.quizquestion.R
import com.barryzeha.quizquestion.common.Constant
import com.barryzeha.quizquestion.common.loadUrl
import com.barryzeha.quizquestion.common.startActivity
import com.barryzeha.quizquestion.databinding.ActivityScoreBinding
import com.barryzeha.quizquestion.model.RankingModel
import com.barryzeha.quizquestion.viewModel.RankingViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
@AndroidEntryPoint
class ScoreActivity : AppCompatActivity() {
    private lateinit var bind:ActivityScoreBinding
    private  var totalPoints:Int?=null
    private val viewModelRanking:RankingViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityScoreBinding.inflate(layoutInflater)
        bind.ivScoreBackground.loadUrl(R.drawable.question_background)
        setContentView(bind.root)

        populateScoreInfo()
        setUpListeners()
    }
    private fun populateScoreInfo()= with(bind){
        totalPoints = intent?.extras?.getInt(Constant.POINTS_EXTRAS)
        totalPoints?.let{ points->
            tvPoints.text=points.toString()
            when (points) {
                in 200..300 -> {
                    tvScore.text=getString(R.string.scoreMaxMsg)
                }
                in 150 ..200 -> {
                    tvScore.text=getString(R.string.scoreMediumMsg)
                }
                else -> {
                    tvScore.text=getString(R.string.lowScoreMsg)
                }
            }
        }
    }
    private fun setUpListeners(){
        bind.btnExit.setOnClickListener {
            startActivity<MainActivity> {
                flags= Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK
            }
        }
        bind.btnSave.setOnClickListener {
            if(bind.edtPlayer.text.isNullOrEmpty()){
                Toast.makeText(this, getString(R.string.writeYouName), Toast.LENGTH_SHORT).show()
            }
            else{
                saveRanking(RankingModel(0,bind.edtPlayer.text.toString(),totalPoints!! ))
            }
        }
    }
    private fun saveRanking(ranking:RankingModel){
        CoroutineScope(Dispatchers.IO).launch {
            viewModelRanking.saveRanking(ranking)
            withContext(Dispatchers.Main){
                Toast.makeText(this@ScoreActivity, getString(R.string.savedScore), Toast.LENGTH_SHORT).show()
                goToRanking()

            }
        }
    }
    private fun goToRanking(){
        bind.edtPlayer.setText("")
        bind.btnSave.isEnabled=false
        bind.btnExit.isEnabled=false
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity<RankingActivity> {
                flags= Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK
            }
        },1000)
    }
    override fun onBackPressed() {}
}