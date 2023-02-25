package dmujanovic.quizzapp

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import org.w3c.dom.Text

class QuizQuestionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        val questionsList = Constants.getQuestions()
        Log.i("Questions Size", "${questionsList.size}")

        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        val progressText = findViewById<TextView>(R.id.tvProgressbar)
        val questiontext= findViewById<TextView>(R.id.tvQuestion)
        val imageView = findViewById<ImageView>(R.id.ivImage)
        val optionONe = findViewById<TextView>(R.id.tvOptionOne)
        val optionTwo = findViewById<TextView>(R.id.tvOptionTwo)
        val optionThree = findViewById<TextView>(R.id.tvOptionThree)
        val optionFour = findViewById<TextView>(R.id.tvOptionFour)

        val currentPosition = 1
        val question: Question? = questionsList[currentPosition -1]
        progressBar.progress = currentPosition
        progressText.text = "$currentPosition" + "/" + progressBar.max

        questiontext.text = question!!.question
        imageView.setImageResource(question.image)
        optionONe.text = question.optionOne
        optionTwo.text = question.optionTwo
        optionThree.text = question.optionThree
        optionFour.text = question.optionFour


    }
}