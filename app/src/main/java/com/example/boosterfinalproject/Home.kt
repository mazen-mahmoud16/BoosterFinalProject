package com.example.boosterfinalproject

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.core.view.marginTop
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*


class Home : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)

    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        //var visibility = arguments?.getString("visibility")?:"aa"
        //Log.e("home",visibility)
        checkVisibility(MainActivity.data)
    }
    fun checkVisibility( visibility:String){
        if(visibility=="visible") {
            totaltext.visibility = View.VISIBLE
            personname.visibility = View.VISIBLE
            icon.visibility = View.VISIBLE
            icon2.visibility = View.VISIBLE
            icon3.visibility = View.VISIBLE
            icon4.visibility = View.VISIBLE
            rank.visibility = View.VISIBLE
            personPercentage.visibility = View.VISIBLE
            personImage.visibility = View.VISIBLE
        }
        else Log.e("home",visibility)

    }
}