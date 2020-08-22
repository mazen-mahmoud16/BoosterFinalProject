package com.example.boosterfinalproject.ui.Activities

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.boosterfinalproject.R
import com.example.boosterfinalproject.adapters.LessonAdapter
import com.example.boosterfinalproject.viewmodels.LessonViewModel
import kotlinx.android.synthetic.main.activity_awareness_room.*
import kotlinx.android.synthetic.main.activity_lesson1refrence.*


class AwarenessRoom : AppCompatActivity() {

    private val viewModel2: LessonViewModel by viewModels()

    override fun onResume() {
        super.onResume()
        //To fill the recyclerview with the data(list) coming from the repository
        if(goals.isEnabled==true)
            goalsClicked()
        else if(weak.isEnabled==true)
        weakClicked()
        else if(core.isEnabled==true)
            coreClicked()
        else supportClicked()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_awareness_room)

        core.isEnabled = false
        weak.isEnabled = false
        goals.isEnabled = false


        //To fill the recyclerview with the data(list) coming from the repository
        viewModel2.getLessonDataSupport().observe(this, Observer {
            main.adapter = LessonAdapter(this, it)
        })

        //These conditions are implemented to open the onclick listener for the other lessons
        //only when the 5 lessons before are finished
        if (intent.getStringExtra("checked") == "Support System") {
            book.setImageDrawable(getDrawable(R.drawable.shape2))
            checkMark.visibility = View.VISIBLE
            core.isEnabled = true
        }
         if (intent.getStringExtra("checked") == "Core Value") {
             core.isEnabled = true
             weak.isEnabled = true
             book.setImageDrawable(getDrawable(R.drawable.shape2))
             checkMark.visibility = View.VISIBLE
         }
        if (intent.getStringExtra("checked") == "Strength-Weakness") {
            goals.isEnabled = true
            core.isEnabled = true
            weak.isEnabled = true
            book.setImageDrawable(getDrawable(R.drawable.shape2))
            checkMark.visibility = View.VISIBLE
        }
        if (intent.getStringExtra("checked") == "Goals and Aspiration") {
            goals.isEnabled = true
            core.isEnabled = true
            weak.isEnabled = true
            book.setImageDrawable(getDrawable(R.drawable.shape2))
            checkMark.visibility = View.VISIBLE
        }

        core.setOnClickListener() {
            coreClicked()
        }
        support.setOnClickListener() {
            supportClicked()
        }
        weak.setOnClickListener() {
            weakClicked()
        }
        goals.setOnClickListener() {
            goalsClicked()
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
        viewModel2.getLessonDataSupport().observe(this, Observer {
            main.adapter = LessonAdapter(this, it)
        })
    }

    fun coreClicked() {
        core.setBackground(getDrawable(R.drawable.backrounded))
        core.setTextColor(Color.BLACK)
        support.setBackground(getDrawable(R.drawable.backk))
        support.setTextColor(Color.parseColor("#aa1f314a"))
        weak.setBackground(getDrawable(R.drawable.backk))
        weak.setTextColor(Color.parseColor("#aa1f314a"))
        goals.setBackground(getDrawable(R.drawable.backk))
        goals.setTextColor(Color.parseColor("#aa1f314a"))
        viewModel2.getLessonDataCore().observe(this, Observer {
            main.adapter = LessonAdapter(this, it)
        })
    }

    fun weakClicked() {
        weak.setBackground(getDrawable(R.drawable.backrounded))
        weak.setTextColor(Color.BLACK)
        support.setBackground(getDrawable(R.drawable.backk))
        support.setTextColor(Color.parseColor("#aa1f314a"))
        core.setBackground(getDrawable(R.drawable.backk))
        core.setTextColor(Color.parseColor("#aa1f314a"))
        goals.setBackground(getDrawable(R.drawable.backk))
        goals.setTextColor(Color.parseColor("#aa1f314a"))
        viewModel2.getLessonDataWeak().observe(this, Observer {
            main.adapter = LessonAdapter(this, it)
        })
    }

    fun goalsClicked() {
        goals.setBackground(getDrawable(R.drawable.backrounded))
        goals.setTextColor(Color.BLACK)
        support.setBackground(getDrawable(R.drawable.backk))
        support.setTextColor(Color.parseColor("#aa1f314a"))
        weak.setBackground(getDrawable(R.drawable.backk))
        weak.setTextColor(Color.parseColor("#aa1f314a"))
        core.setBackground(getDrawable(R.drawable.backk))
        core.setTextColor(Color.parseColor("#aa1f314a"))
        viewModel2.getLessonDataGoals().observe(this, Observer {
            main.adapter = LessonAdapter(this, it)
        })
    }
}


