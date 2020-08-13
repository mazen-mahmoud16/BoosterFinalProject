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
        claim.setOnClickListener(){
            val intent: Intent = Intent(this,
                AwarenessRoom::class.java)
            startActivity(intent)
        }
    }
}