package com.example.boosterfinalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_awareness_room.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start.setOnClickListener {
            val intent:Intent = Intent(this,HomeScrolled::class.java)
            intent.putExtra("home",false)
            startActivity(intent)
        }
        login.setOnClickListener {
            val intent:Intent = Intent(this,HomeScrolled::class.java)
            intent.putExtra("home",true)
            startActivity(intent)
        }

    }
}
