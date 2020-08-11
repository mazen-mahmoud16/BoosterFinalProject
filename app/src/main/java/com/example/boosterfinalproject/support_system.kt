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
    var answer:Boolean=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_support_system)
        submit.setOnClickListener(){
            if(answer==true)
                Toast.makeText(this,"Right Answer! Thank you",Toast.LENGTH_SHORT).show()
            else Toast.makeText(this,"Wrong Answer, try again",Toast.LENGTH_SHORT).show()
        }
        Answer1.setOnClickListener(){
            Answer1.setBackground(getDrawable(R.drawable.roundedborder))
            Answer1.setTextColor(Color.parseColor("#22d0c4"))
            Answer2.setBackground(getDrawable(R.drawable.textbg))
            Answer2.setTextColor(Color.parseColor("#7D8C8B"))
            Answer3.setBackground(getDrawable(R.drawable.textbg))
            Answer3.setTextColor(Color.parseColor("#7D8C8B"))
            Answer4.setBackground(getDrawable(R.drawable.textbg))
            Answer4.setTextColor(Color.parseColor("#7D8C8B"))
            answer=false
        }
        Answer2.setOnClickListener(){
            Answer2.setBackground(getDrawable(R.drawable.roundedborder))
            Answer2.setTextColor(Color.parseColor("#22d0c4"))
            Answer1.setBackground(getDrawable(R.drawable.textbg))
            Answer1.setTextColor(Color.parseColor("#7D8C8B"))
            Answer3.setBackground(getDrawable(R.drawable.textbg))
            Answer3.setTextColor(Color.parseColor("#7D8C8B"))
            Answer4.setBackground(getDrawable(R.drawable.textbg))
            Answer4.setTextColor(Color.parseColor("#7D8C8B"))
            answer=false
        }
        Answer3.setOnClickListener(){
            Answer3.setBackground(getDrawable(R.drawable.roundedborder))
            Answer3.setTextColor(Color.parseColor("#22d0c4"))
            Answer2.setBackground(getDrawable(R.drawable.textbg))
            Answer2.setTextColor(Color.parseColor("#7D8C8B"))
            Answer1.setBackground(getDrawable(R.drawable.textbg))
            Answer1.setTextColor(Color.parseColor("#7D8C8B"))
            Answer4.setBackground(getDrawable(R.drawable.textbg))
            Answer4.setTextColor(Color.parseColor("#7D8C8B"))
            answer=false
        }
        Answer4.setOnClickListener(){
            Answer4.setBackground(getDrawable(R.drawable.roundedborder))
            Answer4.setTextColor(Color.parseColor("#22d0c4"))
            Answer2.setBackground(getDrawable(R.drawable.textbg))
            Answer2.setTextColor(Color.parseColor("#7D8C8B"))
            Answer3.setBackground(getDrawable(R.drawable.textbg))
            Answer3.setTextColor(Color.parseColor("#7D8C8B"))
            Answer1.setBackground(getDrawable(R.drawable.textbg))
            Answer1.setTextColor(Color.parseColor("#7D8C8B"))
            answer=true
        }
    }
}