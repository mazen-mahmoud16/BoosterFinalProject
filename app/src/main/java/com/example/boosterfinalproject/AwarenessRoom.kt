package com.example.boosterfinalproject

import android.os.Bundle
import android.view.View.OnTouchListener
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_awareness_room.*


class AwarenessRoom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_awareness_room)
        val dataaAdapter=DataAdapter(getLessonList())
        main.adapter=dataaAdapter
        core.setOnClickListener(){
            core.setBackground(getDrawable(R.drawable.backrounded))
        }



    }
    private fun getLessonList() : ArrayList<Data> {
        val LessonList: ArrayList<Data> = ArrayList()
        LessonList.add(Data("Support System", "Lesson 1", "Building an integral support system,\n" +
                "Pushes you to grow, strech more, mainly asks why things wont work, and bullet proofs ideas","Start"))
        LessonList.add(Data("Support System", "Lesson 2", "Building an integral support system,\n" +
                "Pushes you to grow, strech more, mainly asks why things wont work, and bullet proofs ideas","Locked"))
        LessonList.add(Data("Support System", "Lesson 3", "Building an integral support system,\n" +
                "Pushes you to grow, strech more, mainly asks why things wont work, and bullet proofs ideas","Locked"))
        LessonList.add(Data("Support System", "Lesson 4", "Building an integral support system,\n" +
                "Pushes you to grow, strech more, mainly asks why things wont work, and bullet proofs ideas","Locked"))
        return LessonList

    }
}


