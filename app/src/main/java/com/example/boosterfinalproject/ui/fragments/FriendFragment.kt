package com.example.boosterfinalproject.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.boosterfinalproject.adapters.FriendAdapter
import com.example.boosterfinalproject.viewmodels.FriendViewModel
import com.example.boosterfinalproject.R
import kotlinx.android.synthetic.main.fragment_friend.*

class FriendFragment : Fragment() {

    private val viewModel: FriendViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        viewModel.getTokenData().observe(viewLifecycleOwner, Observer {
            recyclerView.adapter =
                FriendAdapter(this, it)
        })

        return inflater.inflate(R.layout.fragment_friend, container, false)
    }

}