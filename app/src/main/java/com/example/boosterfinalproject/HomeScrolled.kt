package com.example.boosterfinalproject

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


class HomeScrolled : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_scrolled, container, false)
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        var nouran = arguments?.getString("abc")?:"aa"
        Log.e("home",FragmentHolder.data)
        if(nouran==""){
            findNavController().navigate(HomeScrolledDirections.actionHomeScrolledToHome3()
            )
//            activity?.startActivity(Intent(requireContext(), AwarenessRoom::class.java))
        }
    }



}