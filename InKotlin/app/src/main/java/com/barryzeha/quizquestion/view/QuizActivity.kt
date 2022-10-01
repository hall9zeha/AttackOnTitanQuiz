package com.barryzeha.quizquestion.view

import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import android.widget.Button
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import com.barryzeha.quizquestion.R
import com.barryzeha.quizquestion.common.*
import com.barryzeha.quizquestion.databinding.ActivityQuizBinding
import com.barryzeha.quizquestion.model.QuestionModel
import com.barryzeha.quizquestion.viewModel.QuestionViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlin.random.Random

@AndroidEntryPoint
class QuizActivity : AppCompatActivity() {
    private lateinit var bind: ActivityQuizBinding
    private lateinit var timer:CountDownTimer
    private lateinit var arrayButtons:Array<Button>
    private val viewModelQuestion:QuestionViewModel by viewModels()
    private lateinit var randomSet:HashSet<Int>
    private var answer=0
    private var numOfQuestion=1
    private var totalPoints=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(bind.root)
        randomSet=generateRandomArray()
        arrayButtons = arrayOf(bind.btnAnswer1,bind.btnAnswer2,bind.btnAnswer3)
        bind.ivBackgroundQuestion.loadUrl(R.drawable.question_background)
        setUpViewModel()
        initTimer()


    }
    private fun setUpViewModel(){
        //first call

        viewModelQuestion.getRandomQuestion(randomSet).observe(this, Observer(::populateQuestionView))
    }
    private fun populateQuestionView(question:QuestionModel?){
        question?.let{q->
            bind.tvQuestion.text=q.question
            bind.ivQuestion.loadUrl(q.url)
            bind.btnAnswer1.text=q.answer1
            bind.btnAnswer2.text=q.answer2
            bind.btnAnswer3.text=q.answer3
            answer=q.correctAnswer
        }
    }

    private fun initTimer(){
        timer = object : CountDownTimer(31000,1000){
            override fun onTick(millis: Long) {

                val seconds= millis / 1000
                bind.pbTimer.progress=(seconds.toInt() * 100) / 30
                when(seconds){
                    20L->bind.pbTimer.setIndicatorColor(ContextCompat.getColor(this@QuizActivity,R.color.green))
                    15L-> bind.pbTimer.setIndicatorColor(ContextCompat.getColor(this@QuizActivity,R.color.yellow))
                    8L-> bind.pbTimer.setIndicatorColor(ContextCompat.getColor(this@QuizActivity,R.color.red))
                }
                bind.tvTimer.text=seconds.toString()
            }

            override fun onFinish() {
                timer.cancel()
                arrayButtons[answer - 1].setBackgroundColor(ContextCompat.getColor(this@QuizActivity,R.color.green))
                enableButtons(false)
                nextQuestion()
            }

        }
        setUpButtonsListeners()
        timer.start()
    }
    private fun setUpButtonsListeners(){
        arrayButtons.forEach { btn->
            btn.setOnClickListener {
                timer.cancel()
                if(btn.tag.toString().toInt()== answer){
                    btn.setBackgroundColor(ContextCompat.getColor(this,R.color.green))
                    totalPoints +=bind.tvTimer.text.toString().toInt()
                }
                else{
                    btn.incorrectAnswer(arrayButtons,answer)
                }
                enableButtons(false)
                nextQuestion()
            }
        }
    }
    private fun nextQuestion(){
        Handler(Looper.getMainLooper()).postDelayed(
            {
                if(numOfQuestion ==10){

                    startActivity<ScoreActivity> {
                       putExtra(Constant.POINTS_EXTRAS,totalPoints)
                    }
                }
                else{
                    viewModelQuestion.getRandomQuestion(randomSet)
                    arrayButtons.forEach { it.clear() }
                    bind.pbTimer.setIndicatorColor(ContextCompat.getColor(this,R.color.white))
                    enableButtons(true)
                    initTimer()
                    numOfQuestion++

                }
            },1000
        )
    }
    private fun enableButtons(state:Boolean){
        bind.btnAnswer1.isEnabled=state
        bind.btnAnswer2.isEnabled=state
        bind.btnAnswer3.isEnabled=state
    }
    private fun generateRandomArray():HashSet<Int>{
        val size=10
        val s= HashSet<Int>(size)
        while(s.size < size){
            s += Random.nextInt(0,27)
        }
        return s
    }
}