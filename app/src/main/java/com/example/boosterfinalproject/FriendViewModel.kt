package com.example.boosterfinalproject

import androidx.lifecycle.ViewModel

class FriendViewModel : ViewModel() {

    fun getTokenData(): List<FriendToken> {
        return TokenRepository.tokenData()
    }
}