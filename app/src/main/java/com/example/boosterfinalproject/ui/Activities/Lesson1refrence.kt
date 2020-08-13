package com.example.boosterfinalproject.ui.Activities


import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.boosterfinalproject.R
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import kotlinx.android.synthetic.main.activity_lesson1refrence.*
import kotlinx.android.synthetic.main.activity_lesson1refrence.lesson
import kotlinx.android.synthetic.main.activity_support_system.*

class Lesson1refrence : YouTubeBaseActivity() {

    private val youTubeApiKey="AIzaSyDSBeOuBTMocAONqmU00nF9kgCB94g0LYo"

    //This static variable to decide which video on youtube the user will see
    companion object {
        val videoID="a4NT5iBFuZs"
    }

    lateinit var youtubePlayerInit : YouTubePlayer.OnInitializedListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson1refrence)

        initUI()

        //This variable contains the lesson number
        val lessonNumber:String=intent.getStringExtra("lesson")!!
        lesson.text=lessonNumber+" Reference"
        if(lessonNumber=="Lesson 1"){
            firstLesson()
        }
        if(lessonNumber=="Lesson 2"){
            secondLesson()
        }
        if(lessonNumber=="Lesson 3"){
            thirdLesson()
        }
        if(lessonNumber=="Lesson 4"){
            fourthLesson()
        }
        if(lessonNumber=="Lesson 5"){
            fifthLesson()
            check.visibility=View.VISIBLE
        }


    }

    /**
     *  This method is used to begin video from youtube
     **/
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

    /**
     * The five following functions are used as progress bar as the number of lessons increases
     * progress bar is increased with green color instead of gray
     */
    fun firstLesson(){
        first.setBackground(getDrawable(R.drawable.textback))
        second.setBackground(getDrawable(R.drawable.textbackkk))
        third.setBackground(getDrawable(R.drawable.textbackkk))
        fourth.setBackground(getDrawable(R.drawable.textbackkk))
        fifth.setBackground(getDrawable(R.drawable.textbackkk))
    }
    fun secondLesson(){
        second.setBackground(getDrawable(R.drawable.textback))
        first.setBackground(getDrawable(R.drawable.textback))
        third.setBackground(getDrawable(R.drawable.textbackkk))
        fourth.setBackground(getDrawable(R.drawable.textbackkk))
        fifth.setBackground(getDrawable(R.drawable.textbackkk))
    }
    fun thirdLesson(){
        third.setBackground(getDrawable(R.drawable.textback))
        first.setBackground(getDrawable(R.drawable.textback))
        second.setBackground(getDrawable(R.drawable.textback))
        fourth.setBackground(getDrawable(R.drawable.textbackkk))
        fifth.setBackground(getDrawable(R.drawable.textbackkk))
    }
    fun fourthLesson(){
        fourth.setBackground(getDrawable(R.drawable.textback))
        first.setBackground(getDrawable(R.drawable.textback))
        third.setBackground(getDrawable(R.drawable.textback))
        second.setBackground(getDrawable(R.drawable.textback))
        fifth.setBackground(getDrawable(R.drawable.textbackkk))
    }
    fun fifthLesson(){
        fifth.setBackground(getDrawable(R.drawable.textback))
        first.setBackground(getDrawable(R.drawable.textback))
        third.setBackground(getDrawable(R.drawable.textback))
        fourth.setBackground(getDrawable(R.drawable.textback))
        second.setBackground(getDrawable(R.drawable.textback))
    }
}