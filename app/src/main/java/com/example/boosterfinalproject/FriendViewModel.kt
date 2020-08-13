package com.example.boosterfinalproject

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.boosterfinalproject.repositories.TokenRepository

class FriendViewModel : ViewModel() {

    fun getTokenData(): LiveData<List<FriendToken>> {
        return TokenRepository.tokenData()
    }
}