package com.example.boosterfinalproject.ui.Activities

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.boosterfinalproject.R
import kotlinx.android.synthetic.main.activity_lesson1refrence.*
import kotlinx.android.synthetic.main.activity_support_system.*
import kotlinx.android.synthetic.main.activity_support_system.lesson

class SupportSystem : AppCompatActivity() {

    //this variable is used to check whether the user's answer is correct or not
    private var answer: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_support_system)

        //This variable has the lesson quiz number
        var lessonName:String=intent.getStringExtra("lesson")!!

        support.text =intent.getStringExtra("lessonName")!!

        //To make the textview the lesson number
        lesson.text = lessonName

        //This function is used to print toast whether the user is correct or not
        submit.setOnClickListener() {
            if (answer == true)
                Toast.makeText(this, "Right Answer! Thank you", Toast.LENGTH_SHORT).show()
            else Toast.makeText(this, "Wrong Answer, try again", Toast.LENGTH_SHORT).show()
        }

        if(lessonName=="Lesson 1 Quiz"){
            firstLesson()
        }
        if(lessonName=="Lesson 2 Quiz"){
            secondLesson()
        }
        if(lessonName=="Lesson 3 Quiz"){
            thirdLesson()
        }
        if(lessonName=="Lesson 4 Quiz"){
            fourthLesson()
        }
        if(lessonName=="Lesson 5 Quiz"){
            fifthLesson()
        }

        Answer1.setOnClickListener() {
            firstAnswer()
            answer = false
        }
        Answer2.setOnClickListener() {
            secondAnswer()
            answer = false
        }
        Answer3.setOnClickListener() {
            thirdAnswer()
            answer = false
        }
        Answer4.setOnClickListener() {
            fourthAnswer()
            answer = true
        }
    }

    /**
     * The five following functions are used as progress bar as the number of lessons increases
     * progress bar is increased with green color instead of gray
     */
    fun firstLesson(){
        first2.setBackground(getDrawable(R.drawable.textback))
        second2.setBackground(getDrawable(R.drawable.textbackkk))
        third2.setBackground(getDrawable(R.drawable.textbackkk))
        fourth2.setBackground(getDrawable(R.drawable.textbackkk))
        fifth2.setBackground(getDrawable(R.drawable.textbackkk))
        shape.setImageDrawable(getDrawable(R.drawable.book_shelf))
    }
    fun secondLesson(){
        second2.setBackground(getDrawable(R.drawable.textback))
        first2.setBackground(getDrawable(R.drawable.textback))
        third2.setBackground(getDrawable(R.drawable.textbackkk))
        fourth2.setBackground(getDrawable(R.drawable.textbackkk))
        fifth2.setBackground(getDrawable(R.drawable.textbackkk))
        shape.setImageDrawable(getDrawable(R.drawable.book_shelf2))
    }
    fun thirdLesson(){
        third2.setBackground(getDrawable(R.drawable.textback))
        first2.setBackground(getDrawable(R.drawable.textback))
        second2.setBackground(getDrawable(R.drawable.textback))
        fourth2.setBackground(getDrawable(R.drawable.textbackkk))
        fifth2.setBackground(getDrawable(R.drawable.textbackkk))
        shape.setImageDrawable(getDrawable(R.drawable.book_shelf3))
    }
    fun fourthLesson(){
        fourth2.setBackground(getDrawable(R.drawable.textback))
        first2.setBackground(getDrawable(R.drawable.textback))
        third2.setBackground(getDrawable(R.drawable.textback))
        second2.setBackground(getDrawable(R.drawable.textback))
        fifth2.setBackground(getDrawable(R.drawable.textbackkk))
        shape.setImageDrawable(getDrawable(R.drawable.shape))
    }
    fun fifthLesson(){
        fifth2.setBackground(getDrawable(R.drawable.textback))
        first2.setBackground(getDrawable(R.drawable.textback))
        third2.setBackground(getDrawable(R.drawable.textback))
        fourth2.setBackground(getDrawable(R.drawable.textback))
        second2.setBackground(getDrawable(R.drawable.textback))
        shape.setImageDrawable(getDrawable(R.drawable.shape2))
    }
    //***************************************************************************************
    /**
     * The five following functions are used when the user clicks to an answer, it will have green
     * background with green text and all other answers will be as default(gray)
     */
    fun firstAnswer(){
        Answer1.setBackground(getDrawable(R.drawable.roundedborder))
        Answer1.setTextColor(Color.parseColor("#22d0c4"))
        Answer2.setBackground(getDrawable(R.drawable.textbg))
        Answer2.setTextColor(Color.parseColor("#7D8C8B"))
        Answer3.setBackground(getDrawable(R.drawable.textbg))
        Answer3.setTextColor(Color.parseColor("#7D8C8B"))
        Answer4.setBackground(getDrawable(R.drawable.textbg))
        Answer4.setTextColor(Color.parseColor("#7D8C8B"))
    }
    fun secondAnswer(){
        Answer2.setBackground(getDrawable(R.drawable.roundedborder))
        Answer2.setTextColor(Color.parseColor("#22d0c4"))
        Answer1.setBackground(getDrawable(R.drawable.textbg))
        Answer1.setTextColor(Color.parseColor("#7D8C8B"))
        Answer3.setBackground(getDrawable(R.drawable.textbg))
        Answer3.setTextColor(Color.parseColor("#7D8C8B"))
        Answer4.setBackground(getDrawable(R.drawable.textbg))
        Answer4.setTextColor(Color.parseColor("#7D8C8B"))
    }
    fun thirdAnswer(){
        Answer3.setBackground(getDrawable(R.drawable.roundedborder))
        Answer3.setTextColor(Color.parseColor("#22d0c4"))
        Answer2.setBackground(getDrawable(R.drawable.textbg))
        Answer2.setTextColor(Color.parseColor("#7D8C8B"))
        Answer1.setBackground(getDrawable(R.drawable.textbg))
        Answer1.setTextColor(Color.parseColor("#7D8C8B"))
        Answer4.setBackground(getDrawable(R.drawable.textbg))
        Answer4.setTextColor(Color.parseColor("#7D8C8B"))
    }
    fun fourthAnswer(){
        Answer4.setBackground(getDrawable(R.drawable.roundedborder))
        Answer4.setTextColor(Color.parseColor("#22d0c4"))
        Answer2.setBackground(getDrawable(R.drawable.textbg))
        Answer2.setTextColor(Color.parseColor("#7D8C8B"))
        Answer3.setBackground(getDrawable(R.drawable.textbg))
        Answer3.setTextColor(Color.parseColor("#7D8C8B"))
        Answer1.setBackground(getDrawable(R.drawable.textbg))
        Answer1.setTextColor(Color.parseColor("#7D8C8B"))
    }
}