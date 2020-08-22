package com.example.boosterfinalproject.ui.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.boosterfinalproject.R
import kotlinx.android.synthetic.main.activity_congrats.*

class Congrats : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_congrats)

        var lessonTitle =intent.getStringExtra("lessonName")

        //To start Awareness room activity
        claim.setOnClickListener(){
            val intent: Intent = Intent(this,
                AwarenessRoom::class.java)
            if(lessonTitle=="Support System")
            intent.putExtra("checked","Support System")
            if(lessonTitle=="Core Value")
                intent.putExtra("checked","Core Value")
            if(lessonTitle=="Strength-Weakness")
                intent.putExtra("checked","Strength-Weakness")
            if(lessonTitle=="Goals and Aspiration")
                intent.putExtra("checked","Goals and Aspiration")
            startActivity(intent)
        }
    }
}