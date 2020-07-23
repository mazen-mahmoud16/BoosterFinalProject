package com.example.boosterfinalproject

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lesson1refrence.*
@SuppressLint("SetJavaScriptEnabled")
class lesson1refrence : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson1refrence)

        videoView.settings.javaScriptEnabled = true
        videoView.loadUrl("https://www.youtube.com/embed/n7WRDmwqLec")

    }
}