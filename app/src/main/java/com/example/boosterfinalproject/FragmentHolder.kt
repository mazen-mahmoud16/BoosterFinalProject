package com.example.boosterfinalproject

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


class FragmentHolder : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_holder)
        val home=intent.getStringExtra("home")!!
        val bundle = Bundle()
        Log.e("5ara",home)
        bundle.putString("abc", home)
        val myFrag = HomeScrolled()
        myFrag.arguments = bundle

    }

}