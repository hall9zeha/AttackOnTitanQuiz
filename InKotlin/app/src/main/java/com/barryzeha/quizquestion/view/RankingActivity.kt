package com.barryzeha.quizquestion.view

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.barryzeha.quizquestion.R
import com.barryzeha.quizquestion.common.loadUrl
import com.barryzeha.quizquestion.common.startActivity
import com.barryzeha.quizquestion.databinding.ActivityRankingBinding
import com.barryzeha.quizquestion.model.adapters.RankingAdapter
import com.barryzeha.quizquestion.viewModel.RankingViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@AndroidEntryPoint
class RankingActivity : AppCompatActivity() {
    private lateinit var bind : ActivityRankingBinding
    private val rankingViewModel:RankingViewModel by viewModels()
    private var adapter:RankingAdapter?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityRankingBinding.inflate(layoutInflater)
        setContentView(bind.root)
        bind.ivBackgroundRanking.loadUrl(R.drawable.ranking_background)
        setUpViewModel()
        setUpAdapter()
        bind.btnHome.setOnClickListener { startActivity<MainActivity> {
            flags= Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK
        } }

    }
    private fun setUpViewModel() {
        CoroutineScope(Dispatchers.Main).launch {
            rankingViewModel.getRanking().observe(this@RankingActivity) { rankingList ->
                adapter?.addRanking(rankingList)

            }
        }

    }
    private fun setUpAdapter()= with(bind){

        adapter= RankingAdapter()
        rvRanking.setHasFixedSize(true)
        rvRanking.layoutManager=LinearLayoutManager(this@RankingActivity)
        rvRanking.adapter=adapter
    }
}