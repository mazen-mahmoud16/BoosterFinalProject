package com.example.boosterfinalproject


import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import kotlinx.android.synthetic.main.activity_lesson1refrence.*
import kotlinx.android.synthetic.main.activity_lesson1refrence.lesson
import kotlinx.android.synthetic.main.activity_support_system.*

class Lesson1refrence : YouTubeBaseActivity() {

    companion object {
        val videoID="a4NT5iBFuZs"
        val youTubeApiKey="AIzaSyDSBeOuBTMocAONqmU00nF9kgCB94g0LYo"
    }

    lateinit var youtubePlayerInit : YouTubePlayer.OnInitializedListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson1refrence)

        initUI()
        lesson.text=intent.getStringExtra("lesson")+" Reference"
        if(intent.getStringExtra("lesson")=="Lesson 1"){
            first.setBackground(getDrawable(R.drawable.textback))
            second.setBackground(getDrawable(R.drawable.textbackkk))
            third.setBackground(getDrawable(R.drawable.textbackkk))
            fourth.setBackground(getDrawable(R.drawable.textbackkk))
            fifth.setBackground(getDrawable(R.drawable.textbackkk))
        }
        if(intent.getStringExtra("lesson")=="Lesson 2"){
            second.setBackground(getDrawable(R.drawable.textback))
            first.setBackground(getDrawable(R.drawable.textbackkk))
            third.setBackground(getDrawable(R.drawable.textbackkk))
            fourth.setBackground(getDrawable(R.drawable.textbackkk))
            fifth.setBackground(getDrawable(R.drawable.textbackkk))
        }
        if(intent.getStringExtra("lesson")=="Lesson 3"){
            third.setBackground(getDrawable(R.drawable.textback))
            first.setBackground(getDrawable(R.drawable.textbackkk))
            second.setBackground(getDrawable(R.drawable.textbackkk))
            fourth.setBackground(getDrawable(R.drawable.textbackkk))
            fifth.setBackground(getDrawable(R.drawable.textbackkk))
        }
        if(intent.getStringExtra("lesson")=="Lesson 4"){
            fourth.setBackground(getDrawable(R.drawable.textback))
            first.setBackground(getDrawable(R.drawable.textbackkk))
            third.setBackground(getDrawable(R.drawable.textbackkk))
            second.setBackground(getDrawable(R.drawable.textbackkk))
            fifth.setBackground(getDrawable(R.drawable.textbackkk))
        }
        if(intent.getStringExtra("lesson")=="Lesson 5"){
            fifth.setBackground(getDrawable(R.drawable.textback))
            first.setBackground(getDrawable(R.drawable.textbackkk))
            third.setBackground(getDrawable(R.drawable.textbackkk))
            fourth.setBackground(getDrawable(R.drawable.textbackkk))
            second.setBackground(getDrawable(R.drawable.textbackkk))
            check.visibility=View.VISIBLE
        }


    }

    private fun initUI() {
        youtubePlayerInit = object : YouTubePlayer.OnInitializedListener{
            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, youTubePlayer: YouTubePlayer?, p2: Boolean) {
                youTubePlayer?.loadVideo(videoID)
            }

            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
                Toast.makeText(applicationContext, "No available video, Please try again later",
                    Toast.LENGTH_LONG).show()
            }
        }

            videoView.initialize(youTubeApiKey,youtubePlayerInit)

    }
}