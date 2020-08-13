package com.example.boosterfinalproject.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.boosterfinalproject.R
import com.example.boosterfinalproject.adapters.PersonAdapter
import com.example.boosterfinalproject.viewmodels.PersonViewModel
import kotlinx.android.synthetic.main.fragment_achievements.*


class Achievements : Fragment() {

    private val viewModel: PersonViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //To fill the recyclerview with the data(list) coming from the repository
        viewModel.getPersonData().observe(viewLifecycleOwner, Observer {
            main.adapter=PersonAdapter(it)
        })

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_achievements, container, false)

    }





}
