package com.example.boosterfinalproject.ui.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.boosterfinalproject.R
import com.example.boosterfinalproject.ui.fragments.Home
import kotlinx.android.synthetic.main.activity_main.*

class Welcome : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        start.setOnClickListener {
            val intent:Intent = Intent(this,
                FragmentHolder::class.java)
            data ="Invisible"
            startActivity(intent)
        }
        login.setOnClickListener {
            val intent:Intent = Intent(this,
                FragmentHolder::class.java)
            data ="visible"
            startActivity(intent)
        }


    }
    /**
     *This variable is used to check whether the user presses get started to make the profile
     * tab invisible
     * or the user presses login and his/her profile tab will be visible
     **/
    companion object {
     var data = ""
 }
}
