package com.barryzeha.quizquestion.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.barryzeha.quizquestion.R
import com.barryzeha.quizquestion.common.loadUrl
import com.barryzeha.quizquestion.common.startActivity
import com.barryzeha.quizquestion.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bind: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind= ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        setUpListeners()

    }


    private fun setUpListeners() {
        bind.ivBackgroundMain.loadUrl(R.drawable.main_wallpaper)
        bind.btnPlay.setOnClickListener { startActivity<QuizActivity> {} }
        bind.btnSeeRanking.setOnClickListener{startActivity<RankingActivity> {}}
    }
}