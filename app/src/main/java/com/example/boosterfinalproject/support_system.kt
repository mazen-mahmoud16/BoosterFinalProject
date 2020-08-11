package com.example.boosterfinalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_lesson1refrence.*
import kotlinx.android.synthetic.main.activity_support_system.*
import kotlinx.android.synthetic.main.activity_support_system.lesson

class support_system : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_support_system)
        submit.setOnClickListener(){
            Toast.makeText(this,"Right Answer! Thank you",Toast.LENGTH_LONG).show()
        }

    }
}