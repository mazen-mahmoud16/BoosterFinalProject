package com.example.boosterfinalproject.repositories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.boosterfinalproject.models.FriendToken
import com.example.boosterfinalproject.R

object TokenRepository {
    private val tokenList: MutableList<FriendToken> = mutableListOf()

    fun tokenData(): LiveData<List<FriendToken>> {
        val tokenLiveData:MutableLiveData<List<FriendToken>> = MutableLiveData()
        tokenList.add(
            FriendToken(
                "Quick Learner",
                "Completed 1 course",
                R.drawable.icon
            )
        )
        tokenList.add(
            FriendToken(
                "Master Mind!",
                "Got 1st place on leaderboard",
                R.drawable.icon_2
            )
        )
        tokenList.add(
            FriendToken(
                "Super Learner",
                "Completed more than 5 courses",
                R.drawable.icon_3
            )
        )
        tokenList.add(
            FriendToken(
                "The Achiever",
                "Logged in everyday for a month",
                R.drawable.icon_4
            )
        )
        tokenLiveData.postValue(tokenList)
        return tokenLiveData
    }
}