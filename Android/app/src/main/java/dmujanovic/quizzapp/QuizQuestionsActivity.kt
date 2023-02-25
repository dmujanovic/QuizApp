package dmujanovic.quizzapp

import android.graphics.Color
import android.graphics.Typeface
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat
import org.w3c.dom.Text

class QuizQuestionsActivity : AppCompatActivity(), OnClickListener {

    private lateinit var progressBar: ProgressBar
    private lateinit var progressText: TextView
    private lateinit var questiontext: TextView
    private lateinit var imageView: ImageView
    private lateinit var optionONe: TextView
    private lateinit var optionTwo: TextView
    private lateinit var optionThree: TextView
    private lateinit var optionFour: TextView
    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        progressBar = findViewById(R.id.progressBar)
        progressText = findViewById(R.id.tvProgressbar)
        questiontext = findViewById(R.id.tvQuestion)
        imageView = findViewById(R.id.ivImage)
        optionONe = findViewById(R.id.tvOptionOne)
        optionTwo = findViewById(R.id.tvOptionTwo)
        optionThree = findViewById(R.id.tvOptionThree)
        optionFour = findViewById(R.id.tvOptionFour)

        mQuestionsList = Constants.getQuestions()
        setQuestion()
        optionONe.setOnClickListener(this)
        optionTwo.setOnClickListener(this)
        optionThree.setOnClickListener(this)
        optionFour.setOnClickListener(this)


    }
    private fun setQuestion() {
        mCurrentPosition = 1
        val question = mQuestionsList!![mCurrentPosition - 1]
        defaultOptionsView()
        progressBar.progress = mCurrentPosition
        progressText.text = "$mCurrentPosition" + "/" + progressBar.max
        questiontext.text = question!!.question
        imageView.setImageResource(question.image)
        optionONe.text = question.optionOne
        optionTwo.text = question.optionTwo
        optionThree.text = question.optionThree
        optionFour.text = question.optionFour
    }

    private fun defaultOptionsView() {
        val options = ArrayList<TextView>()
        options.add(0, optionONe)
        options.add(1, optionTwo)
        options.add(2, optionThree)
        options.add(3, optionFour)
        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tvOptionOne -> {
                selectedOptionView(optionONe, 1)
            }
            R.id.tvOptionTwo -> {
                selectedOptionView(optionTwo, 2)
            }
            R.id.tvOptionThree -> {
                selectedOptionView(optionThree, 3)
            }
            R.id.tvOptionFour -> {
                selectedOptionView(optionFour, 4)
            }
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNumber: Int) {
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNumber
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_option_border_bg
        )
    }
}