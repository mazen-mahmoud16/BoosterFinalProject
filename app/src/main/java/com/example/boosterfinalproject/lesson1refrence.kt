package com.example.boosterfinalproject


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import kotlinx.android.synthetic.main.activity_lesson1refrence.*

class lesson1refrence : YouTubeBaseActivity() {

    companion object {
        val videoID="a4NT5iBFuZs"
        val youTubeApiKey="AIzaSyDSBeOuBTMocAONqmU00nF9kgCB94g0LYo"
    }

    lateinit var youtubePlayerInit : YouTubePlayer.OnInitializedListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson1refrence)

        initUI()

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