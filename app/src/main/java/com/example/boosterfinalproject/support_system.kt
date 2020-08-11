package com.example.boosterfinalproject

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_awareness_room.*
import kotlinx.android.synthetic.main.activity_lesson1refrence.*
import kotlinx.android.synthetic.main.activity_support_system.*
import kotlinx.android.synthetic.main.activity_support_system.lesson

class support_system : AppCompatActivity() {
    var answer: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_support_system)
        var lessonName:String=intent.getStringExtra("lesson")!!
        lesson.text = lessonName
        if(lessonName=="Lesson 1 Quiz"){
            first2.setBackground(getDrawable(R.drawable.textback))
            second2.setBackground(getDrawable(R.drawable.textbackkk))
            third2.setBackground(getDrawable(R.drawable.textbackkk))
            fourth2.setBackground(getDrawable(R.drawable.textbackkk))
            fifth2.setBackground(getDrawable(R.drawable.textbackkk))
        }
        if(lessonName=="Lesson 2 Quiz"){
            second2.setBackground(getDrawable(R.drawable.textback))
            first2.setBackground(getDrawable(R.drawable.textbackkk))
            third2.setBackground(getDrawable(R.drawable.textbackkk))
            fourth2.setBackground(getDrawable(R.drawable.textbackkk))
            fifth2.setBackground(getDrawable(R.drawable.textbackkk))
        }
        if(lessonName=="Lesson 3 Quiz"){
            third2.setBackground(getDrawable(R.drawable.textback))
            first2.setBackground(getDrawable(R.drawable.textbackkk))
            second2.setBackground(getDrawable(R.drawable.textbackkk))
            fourth2.setBackground(getDrawable(R.drawable.textbackkk))
            fifth2.setBackground(getDrawable(R.drawable.textbackkk))
        }
        if(lessonName=="Lesson 4 Quiz"){
            fourth2.setBackground(getDrawable(R.drawable.textback))
            first2.setBackground(getDrawable(R.drawable.textbackkk))
            third2.setBackground(getDrawable(R.drawable.textbackkk))
            second2.setBackground(getDrawable(R.drawable.textbackkk))
            fifth2.setBackground(getDrawable(R.drawable.textbackkk))
        }
        if(lessonName=="Lesson 5 Quiz"){
            fifth2.setBackground(getDrawable(R.drawable.textback))
            first2.setBackground(getDrawable(R.drawable.textbackkk))
            third2.setBackground(getDrawable(R.drawable.textbackkk))
            fourth2.setBackground(getDrawable(R.drawable.textbackkk))
            second2.setBackground(getDrawable(R.drawable.textbackkk))
        }
        submit.setOnClickListener() {
            if (answer == true)
                Toast.makeText(this, "Right Answer! Thank you", Toast.LENGTH_SHORT).show()
            else Toast.makeText(this, "Wrong Answer, try again", Toast.LENGTH_SHORT).show()
        }
        Answer1.setOnClickListener() {
            Answer1.setBackground(getDrawable(R.drawable.roundedborder))
            Answer1.setTextColor(Color.parseColor("#22d0c4"))
            Answer2.setBackground(getDrawable(R.drawable.textbg))
            Answer2.setTextColor(Color.parseColor("#7D8C8B"))
            Answer3.setBackground(getDrawable(R.drawable.textbg))
            Answer3.setTextColor(Color.parseColor("#7D8C8B"))
            Answer4.setBackground(getDrawable(R.drawable.textbg))
            Answer4.setTextColor(Color.parseColor("#7D8C8B"))
            answer = false
        }
        Answer2.setOnClickListener() {
            Answer2.setBackground(getDrawable(R.drawable.roundedborder))
            Answer2.setTextColor(Color.parseColor("#22d0c4"))
            Answer1.setBackground(getDrawable(R.drawable.textbg))
            Answer1.setTextColor(Color.parseColor("#7D8C8B"))
            Answer3.setBackground(getDrawable(R.drawable.textbg))
            Answer3.setTextColor(Color.parseColor("#7D8C8B"))
            Answer4.setBackground(getDrawable(R.drawable.textbg))
            Answer4.setTextColor(Color.parseColor("#7D8C8B"))
            answer = false
        }
        Answer3.setOnClickListener() {
            Answer3.setBackground(getDrawable(R.drawable.roundedborder))
            Answer3.setTextColor(Color.parseColor("#22d0c4"))
            Answer2.setBackground(getDrawable(R.drawable.textbg))
            Answer2.setTextColor(Color.parseColor("#7D8C8B"))
            Answer1.setBackground(getDrawable(R.drawable.textbg))
            Answer1.setTextColor(Color.parseColor("#7D8C8B"))
            Answer4.setBackground(getDrawable(R.drawable.textbg))
            Answer4.setTextColor(Color.parseColor("#7D8C8B"))
            answer = false
        }
        Answer4.setOnClickListener() {
            Answer4.setBackground(getDrawable(R.drawable.roundedborder))
            Answer4.setTextColor(Color.parseColor("#22d0c4"))
            Answer2.setBackground(getDrawable(R.drawable.textbg))
            Answer2.setTextColor(Color.parseColor("#7D8C8B"))
            Answer3.setBackground(getDrawable(R.drawable.textbg))
            Answer3.setTextColor(Color.parseColor("#7D8C8B"))
            Answer1.setBackground(getDrawable(R.drawable.textbg))
            Answer1.setTextColor(Color.parseColor("#7D8C8B"))
            answer = true
        }
    }
}