package com.example.boosterfinalproject

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity

class Friend : AppCompatActivity() {
    private val viewModel: FriendViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friend)
        FriendAdapter(this, viewModel.getTokenData())


    }
}