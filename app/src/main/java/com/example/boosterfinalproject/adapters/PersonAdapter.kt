package com.example.boosterfinalproject.adapters

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.boosterfinalproject.R
import com.example.boosterfinalproject.models.Person
import kotlinx.android.synthetic.main.item.view.*
import kotlinx.android.synthetic.main.item.view.item

class PersonAdapter(val Personlist:List<Person>) : RecyclerView.Adapter<PersonAdapter.viewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val layoutinflater=LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return viewHolder(layoutinflater)
    }

    override fun getItemCount(): Int
    {
        return Personlist.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.bindData(Personlist[position])
    }

    inner class viewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val personName: TextView =itemView.name
        val Score: TextView =itemView.points
        val Rank: TextView =itemView.textView14
        val itemm=itemView.item
        val image=itemView.imageView9

        fun bindData(personToken:Person){
            personName.text=personToken.name
            Score.text="${personToken.Score} Points"
            Rank.text=personToken.Rank.toString()
            image.setImageResource(personToken.Image)

            //Set color of the rank 1 player
            if(personToken.Rank==1){
                itemm.setBackgroundColor(Color.parseColor("#22d0c4"))
                Rank.setBackgroundResource(R.drawable.first_rank)
                Rank.setTextColor(Color.parseColor("#1f314a"))
            }
            //Set color of the rank 2 and 3 players
            if(personToken.Rank==2||personToken.Rank==3){
                Rank.setBackgroundResource(R.drawable.second_rank)
                Rank.setTextColor(Color.parseColor("#22d0c4"))
            }
        }
    }
}