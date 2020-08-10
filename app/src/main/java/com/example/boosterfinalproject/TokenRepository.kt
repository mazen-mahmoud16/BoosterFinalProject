package com.example.boosterfinalproject

object TokenRepository {
    private val tokenList: MutableList<FriendToken> = mutableListOf()

    fun tokenData(): List<FriendToken> {
        tokenList.add(FriendToken("Quick Learner", "Completed 1 course", R.drawable.icon))
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
        return tokenList
    }
}