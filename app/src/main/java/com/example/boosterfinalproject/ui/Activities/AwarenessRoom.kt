package com.example.boosterfinalproject.ui.Activities

import android.graphics.Color
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.boosterfinalproject.R
import com.example.boosterfinalproject.adapters.LessonAdapter
import com.example.boosterfinalproject.models.Lesson
import com.example.boosterfinalproject.viewmodels.FriendViewModel
import com.example.boosterfinalproject.viewmodels.LessonViewModel
import kotlinx.android.synthetic.main.activity_awareness_room.*




class AwarenessRoom : AppCompatActivity() {

    private val viewModel2: LessonViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_awareness_room)

        viewModel2.getLessonData().observe(this, Observer {
            main.adapter=LessonAdapter(this,it)
        })

        core.setOnClickListener() {
            core.setBackground(getDrawable(R.drawable.backrounded))
            core.setTextColor(Color.BLACK)
            support.setBackground(getDrawable(R.drawable.backk))
            support.setTextColor(Color.parseColor("#aa1f314a"))
            weak.setBackground(getDrawable(R.drawable.backk))
            weak.setTextColor(Color.parseColor("#aa1f314a"))
            goals.setBackground(getDrawable(R.drawable.backk))
            goals.setTextColor(Color.parseColor("#aa1f314a"))
        }
        support.setOnClickListener() {
            support.setBackground(getDrawable(R.drawable.backrounded))
            support.setTextColor(Color.BLACK)
            core.setBackground(getDrawable(R.drawable.backk))
            core.setTextColor(Color.parseColor("#aa1f314a"))
            weak.setBackground(getDrawable(R.drawable.backk))
            weak.setTextColor(Color.parseColor("#aa1f314a"))
            goals.setBackground(getDrawable(R.drawable.backk))
            goals.setTextColor(Color.parseColor("#aa1f314a"))
        }
        weak.setOnClickListener() {
            weak.setBackground(getDrawable(R.drawable.backrounded))
            weak.setTextColor(Color.BLACK)
            support.setBackground(getDrawable(R.drawable.backk))
            support.setTextColor(Color.parseColor("#aa1f314a"))
            core.setBackground(getDrawable(R.drawable.backk))
            core.setTextColor(Color.parseColor("#aa1f314a"))
            goals.setBackground(getDrawable(R.drawable.backk))
            goals.setTextColor(Color.parseColor("#aa1f314a"))
        }
        goals.setOnClickListener() {
            goals.setBackground(getDrawable(R.drawable.backrounded))
            goals.setTextColor(Color.BLACK)
            support.setBackground(getDrawable(R.drawable.backk))
            support.setTextColor(Color.parseColor("#aa1f314a"))
            weak.setBackground(getDrawable(R.drawable.backk))
            weak.setTextColor(Color.parseColor("#aa1f314a"))
            core.setBackground(getDrawable(R.drawable.backk))
            core.setTextColor(Color.parseColor("#aa1f314a"))
        }


    }

}


