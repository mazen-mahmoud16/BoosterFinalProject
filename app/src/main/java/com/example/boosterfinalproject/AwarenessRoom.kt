package com.example.boosterfinalproject

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
        LessonList.add(Data("Support System", "Quiz", "Good Luck","Start Quiz"))
        LessonList.add(Data("Support System", "Finished", "Thanks for finishing the lesson and the quiz!","Claim your gift!"))
        return LessonList

    }
}


