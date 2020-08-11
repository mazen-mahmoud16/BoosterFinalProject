package com.example.boosterfinalproject

import androidx.lifecycle.ViewModel
import com.example.boosterfinalproject.repositories.TokenRepository

class FriendViewModel : ViewModel() {

    fun getTokenData(): List<FriendToken> {
        return TokenRepository.tokenData()
    }
}