package com.example.boosterfinalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.fragment_friend.*

class FriendFragment : Fragment() {

    private val viewModel: FriendViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //FriendAdapter(this, viewModel.getTokenData())
        viewModel.getTokenData().observe(viewLifecycleOwner, Observer {
            recyclerView.adapter = FriendAdapter(this, it)
        })

        return inflater.inflate(R.layout.fragment_friend, container, false)
    }

}