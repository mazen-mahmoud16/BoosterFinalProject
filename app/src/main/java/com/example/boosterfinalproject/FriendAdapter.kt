package com.example.boosterfinalproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_friend_recyclerview.view.*

class FriendAdapter(private val context: Context, private val tokenList: List<FriendToken>) :
    RecyclerView.Adapter<FriendAdapter.TokenViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TokenViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val tokenViewHolder =
            layoutInflater.inflate(R.layout.activity_friend_recyclerview, parent, false)
        return TokenViewHolder(tokenViewHolder)
    }

    override fun getItemCount(): Int {
        return TokenRepository.tokenData().size
    }

    override fun onBindViewHolder(holder: TokenViewHolder, position: Int) {
        holder.bindData(tokenList[position])
    }

    inner class TokenViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tokenName: TextView = itemView.textView4
        var tokenDescription: TextView = itemView.textView5
        var tokenIcon: ImageView = itemView.imageView
        fun bindData(friendtoken: FriendToken) {
            tokenName.text = friendtoken.token
            tokenDescription.text = friendtoken.tokendescription
            tokenIcon.setImageResource(friendtoken.tokenicon)

        }
    }
}