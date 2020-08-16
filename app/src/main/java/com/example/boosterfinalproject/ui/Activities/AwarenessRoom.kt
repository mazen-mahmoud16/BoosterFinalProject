package com.example.boosterfinalproject.ui.Activities

import android.graphics.Color
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.boosterfinalproject.R
import com.example.boosterfinalproject.adapters.LessonAdapter
import com.example.boosterfinalproject.viewmodels.LessonViewModel
import kotlinx.android.synthetic.main.activity_awareness_room.*




class AwarenessRoom : AppCompatActivity() {

    private val viewModel2: LessonViewModel by viewModels()

    override fun onResume() {
        super.onResume()
        //To fill the recyclerview with the data(list) coming from the repository
        viewModel2.getLessonDataSupport().observe(this, Observer {
            main.adapter=LessonAdapter(this,it)
        })
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_awareness_room)

        //To fill the recyclerview with the data(list) coming from the repository
        viewModel2.getLessonDataSupport().observe(this, Observer {
            main.adapter=LessonAdapter(this,it)
        })



        core.setOnClickListener() {
            coreClicked()
            viewModel2.getLessonDataCore().observe(this, Observer {
                main.adapter=LessonAdapter(this,it)
            })
        }
        support.setOnClickListener() {
            supportClicked()
            viewModel2.getLessonDataSupport().observe(this, Observer {
                main.adapter=LessonAdapter(this,it)
            })
        }
        weak.setOnClickListener() {
            weakClicked()
            viewModel2.getLessonDataWeak().observe(this, Observer {
                main.adapter=LessonAdapter(this,it)
            })
        }
        goals.setOnClickListener() {
            goalsClicked()
            viewModel2.getLessonDataGoals().observe(this, Observer {
                main.adapter=LessonAdapter(this,it)
            })
        }


    }
    /**
     * These functions to highlight the button selected by the user and to unhighlight
     * any other button
     **/
    fun supportClicked() {
        support.setBackground(getDrawable(R.drawable.backrounded))
        support.setTextColor(Color.BLACK)
        core.setBackground(getDrawable(R.drawable.backk))
        core.setTextColor(Color.parseColor("#aa1f314a"))
        weak.setBackground(getDrawable(R.drawable.backk))
        weak.setTextColor(Color.parseColor("#aa1f314a"))
        goals.setBackground(getDrawable(R.drawable.backk))
        goals.setTextColor(Color.parseColor("#aa1f314a"))
    }
    fun coreClicked(){
        core.setBackground(getDrawable(R.drawable.backrounded))
        core.setTextColor(Color.BLACK)
        support.setBackground(getDrawable(R.drawable.backk))
        support.setTextColor(Color.parseColor("#aa1f314a"))
        weak.setBackground(getDrawable(R.drawable.backk))
        weak.setTextColor(Color.parseColor("#aa1f314a"))
        goals.setBackground(getDrawable(R.drawable.backk))
        goals.setTextColor(Color.parseColor("#aa1f314a"))
    }
    fun weakClicked(){
        weak.setBackground(getDrawable(R.drawable.backrounded))
        weak.setTextColor(Color.BLACK)
        support.setBackground(getDrawable(R.drawable.backk))
        support.setTextColor(Color.parseColor("#aa1f314a"))
        core.setBackground(getDrawable(R.drawable.backk))
        core.setTextColor(Color.parseColor("#aa1f314a"))
        goals.setBackground(getDrawable(R.drawable.backk))
        goals.setTextColor(Color.parseColor("#aa1f314a"))
    }
    fun goalsClicked(){
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


