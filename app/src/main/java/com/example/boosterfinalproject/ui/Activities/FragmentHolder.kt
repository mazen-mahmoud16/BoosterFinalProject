package com.example.boosterfinalproject.ui.Activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.boosterfinalproject.R
import kotlinx.android.synthetic.main.activity_fragment_holder.*


class FragmentHolder : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_holder)

        //To link between the bottom navigation bar and the fragments
        val mainNavController = findNavController(R.id.main_nav_host_fragment)
        main_bottom_nav_view.setupWithNavController(mainNavController)

    }


}