package com.example.boosterfinalproject

import android.graphics.Color
import android.os.Bundle
import android.view.View.OnTouchListener
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_awareness_room.*


class AwarenessRoom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_awareness_room)
        val dataaAdapter=DataAdapter(this,getLessonList())
        main.adapter=dataaAdapter
        core.setOnClickListener(){
            core.setBackground(getDrawable(R.drawable.backrounded))
            core.setTextColor(Color.BLACK)
            support.setBackground(getDrawable(R.drawable.backk))
            support.setTextColor(Color.parseColor("#aa1f314a"))
            weak.setBackground(getDrawable(R.drawable.backk))
            weak.setTextColor(Color.parseColor("#aa1f314a"))
            goals.setBackground(getDrawable(R.drawable.backk))
            goals.setTextColor(Color.parseColor("#aa1f314a"))
        }
        support.setOnClickListener(){
            support.setBackground(getDrawable(R.drawable.backrounded))
            support.setTextColor(Color.BLACK)
            core.setBackground(getDrawable(R.drawable.backk))
            core.setTextColor(Color.parseColor("#aa1f314a"))
            weak.setBackground(getDrawable(R.drawable.backk))
            weak.setTextColor(Color.parseColor("#aa1f314a"))
            goals.setBackground(getDrawable(R.drawable.backk))
            goals.setTextColor(Color.parseColor("#aa1f314a"))
        }
        weak.setOnClickListener(){
            weak.setBackground(getDrawable(R.drawable.backrounded))
            weak.setTextColor(Color.BLACK)
            support.setBackground(getDrawable(R.drawable.backk))
            support.setTextColor(Color.parseColor("#aa1f314a"))
            core.setBackground(getDrawable(R.drawable.backk))
            core.setTextColor(Color.parseColor("#aa1f314a"))
            goals.setBackground(getDrawable(R.drawable.backk))
            goals.setTextColor(Color.parseColor("#aa1f314a"))
        }
        goals.setOnClickListener(){
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
    private fun getLessonList() : ArrayList<Data> {
        val LessonList: ArrayList<Data> = ArrayList()
        LessonList.add(Data("Support System", "Lesson 1", "Building an integral support system,\n" +
                "Pushes you to grow, strech more, mainly asks why things wont work, and bullet proofs ideas","Start"))
        LessonList.add(Data("Support System", "Lesson 2", "These generic visual supports templates " +
                "will be a gamechanger for you and your students this comprehensive set is perfect for you!","Locked"))
        LessonList.add(Data("Support System", "Lesson 3", "If you are looking for a fun and " +
                "innovative way to motivate your students to improve their handwriting, their skills and their abilities! ","Locked"))
        LessonList.add(Data("Support System", "Lesson 4", "Understanding who you can count on is a key social and emotional " +
                "skill we can teach early and reinforce through high school.","Locked"))
        LessonList.add(Data("Support System", "Lesson 1 Quiz", "Good Luck","Start Quiz"))
        LessonList.add(Data("Support System", "Lesson 2 Quiz", "Good Luck","Start Quiz"))
        LessonList.add(Data("Support System", "Lesson 3 Quiz", "Good Luck","Start Quiz"))
        LessonList.add(Data("Support System", "Lesson 4 Quiz", "Good Luck","Start Quiz"))
        LessonList.add(Data("Support System", "Finished", "Thanks for finishing the lesson and " +
                "the quiz!","Claim your gift!"))
        return LessonList

    }
}


