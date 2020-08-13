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
        val mainNavController = findNavController(R.id.main_nav_host_fragment)
        main_bottom_nav_view.setupWithNavController(mainNavController)
        /*val home = intent.getStringExtra("home")!!
        val bundle = Bundle()
        Log.e("home", home)
        bundle.putString("abc", home)
        val myFrag = HomeScrolled()
        myFrag.arguments = bundle*/

        //Shared viewModel

//        main_bottom_nav_view.setOnNavigationItemSelectedListener {
//            if (it.itemId == R.id.navigation_sms) {
//                Toast.makeText(this, "dasdasa", Toast.LENGTH_LONG).show()
//                return@setOnNavigationItemSelectedListener true
//            }
//            return@setOnNavigationItemSelectedListener false
//        }

    }


}