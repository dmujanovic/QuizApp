package dmujanovic.quizzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    private lateinit var userName: TextView
    private lateinit var score: TextView
    private lateinit var btnFinish : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        userName = findViewById(R.id.tv_name)
        score = findViewById(R.id.tv_score)
        btnFinish = findViewById(R.id.btn_finish)

        val name = intent.getStringExtra(Constants.USER_NAME)
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val correct = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)
        userName.text = name
        score.text = "Your score is $correct out of $totalQuestions"

        btnFinish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

    }
}