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
            val intent:Intent = Intent(this,FragmentHolder::class.java)
            val bundle = Bundle()
            bundle.putString("visibility", "Invisible")
            val myFrag = Home()
            data="Invisible"
            myFrag.arguments = bundle
            //intent.putExtra("home","homeScrolled")
            startActivity(intent)
        }
        login.setOnClickListener {
            val intent:Intent = Intent(this,FragmentHolder::class.java)
            val bundle = Bundle()
            bundle.putString("visibility", "visible")
            data="visible"
            val myFrag = Home()
            myFrag.arguments = bundle
            //intent.putExtra("home","home")
            startActivity(intent)
        }

    }
    companion object {
     var data = ""
 }
}
