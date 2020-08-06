package com.example.boosterfinalproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FriendAdapter(private val context: Context, private val) :
    RecyclerView.Adapter<FriendAdapter.TokenViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TokenViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val tokenViewHolder =
            layoutInflater.inflate(R.layout.activity_friend_recyclerview, parent, false)
        return TokenViewHolder(tokenViewHolder)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: TokenViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    inner class TokenViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var tokenName: String
        lateinit var tokenDescription: String
        var tokenIcon: Int = 0
    }
}