package com.example.boosterfinalproject.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.boosterfinalproject.ui.Activities.AwarenessRoom
import com.example.boosterfinalproject.ui.Activities.Welcome
import com.example.boosterfinalproject.R
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
        checkVisibility(Welcome.data)
        selfAwareness.setOnClickListener(){
            activity?.startActivity(Intent(requireContext(),
                AwarenessRoom::class.java))
        }
    }


    /**
     *This function is used to check whether the user presses get started to make the profile
     * tab invisible
     * or the user presses login and his/her profile tab will be visible
     **/
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
    }

}