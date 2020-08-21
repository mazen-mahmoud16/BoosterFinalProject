package com.example.boosterfinalproject.ui.Activities


import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import com.example.boosterfinalproject.R
import com.example.boosterfinalproject.viewmodels.LessonViewModel
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import kotlinx.android.synthetic.main.activity_lesson1refrence.*
import kotlinx.android.synthetic.main.activity_lesson1refrence.lesson
import kotlinx.android.synthetic.main.activity_support_system.*

class Lesson1refrence : YouTubeBaseActivity() {
    

    private val youTubeApiKey="AIzaSyDSBeOuBTMocAONqmU00nF9kgCB94g0LYo"


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
                youTubePlayer?.loadVideo(LessonViewModel.videoID)
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
     * And change the video of the lesson
     */
    fun firstLesson(){
        first.setBackground(getDrawable(R.drawable.textback))
        second.setBackground(getDrawable(R.drawable.textbackkk))
        third.setBackground(getDrawable(R.drawable.textbackkk))
        fourth.setBackground(getDrawable(R.drawable.textbackkk))
        fifth.setBackground(getDrawable(R.drawable.textbackkk))
        LessonViewModel.videoID="za2oNpHjYL8"
        intro.text="This lesson helps you to understand what is the meaning of recyclerview, which many developers are afraid of" +
                "and do not understand it correctly which makes it so complicated for the developers."
    }
    fun secondLesson(){
        second.setBackground(getDrawable(R.drawable.textback))
        first.setBackground(getDrawable(R.drawable.textback))
        third.setBackground(getDrawable(R.drawable.textbackkk))
        fourth.setBackground(getDrawable(R.drawable.textbackkk))
        fifth.setBackground(getDrawable(R.drawable.textbackkk))
        LessonViewModel.videoID="eLVd0kuLeoI"
        intro.text="This lesson we will try to implement the recyclerview in arabic. It is recommended if you do not watch the first video carefully" +
                ", to open it and watch it again, as this lesson depends on the first lesson."
    }
    fun thirdLesson(){
        third.setBackground(getDrawable(R.drawable.textback))
        first.setBackground(getDrawable(R.drawable.textback))
        second.setBackground(getDrawable(R.drawable.textback))
        fourth.setBackground(getDrawable(R.drawable.textbackkk))
        fifth.setBackground(getDrawable(R.drawable.textbackkk))
        LessonViewModel.videoID="1pu7IDrUq"
        intro.text="You should learn in this lesson how to make a file template. This lesson is in Arabic."
    }
    fun fourthLesson(){
        fourth.setBackground(getDrawable(R.drawable.textback))
        first.setBackground(getDrawable(R.drawable.textback))
        third.setBackground(getDrawable(R.drawable.textback))
        second.setBackground(getDrawable(R.drawable.textback))
        fifth.setBackground(getDrawable(R.drawable.textbackkk))
        LessonViewModel.videoID="DeUhC24aGmQ"
        intro.text="This lesson we will try to make you understand retrofit, as it is so important for the developers nowadays and " +
                "most of the jobs requires to implement retrofit to get data from internet."
    }
    fun fifthLesson(){
        fifth.setBackground(getDrawable(R.drawable.textback))
        first.setBackground(getDrawable(R.drawable.textback))
        third.setBackground(getDrawable(R.drawable.textback))
        fourth.setBackground(getDrawable(R.drawable.textback))
        second.setBackground(getDrawable(R.drawable.textback))
        LessonViewModel.videoID="jmuGZ6Rc8to"
        intro.text="In this lesson we will try to implement the retofit discussed in lesson 4 in android studio " +
                "with ots interfaces. It is recommended to understand lesson 4 properly before watching this video."
    }
}