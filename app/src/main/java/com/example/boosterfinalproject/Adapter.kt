package com.example.boosterfinalproject

import android.graphics.Color
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.*
import kotlinx.android.synthetic.main.item.view.*
import kotlinx.android.synthetic.main.item.view.item

class Adapter(val Personlist:ArrayList<Person>) : RecyclerView.Adapter<Adapter.viewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val layoutinflater=LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return viewHolder(layoutinflater)
    }

    override fun getItemCount(): Int
    {
        return Personlist.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val person= Personlist.get(position)
        holder.personName.text=person.name
        holder.Score.text="${person.Score} Points".toString()
        holder.Rank.text=person.Rank.toString()
        holder.image.setImageResource(person.Image)
        if(person.Rank==1){
            holder.itemm.setBackgroundColor(Color.parseColor("#22d0c4"))
            holder.Rank.setBackgroundResource(R.drawable.first_rank)
            holder.Rank.setTextColor(Color.parseColor("#1f314a"))
        }
        if(person.Rank==2||person.Rank==3){
            holder.Rank.setBackgroundResource(R.drawable.second_rank)
            holder.Rank.setTextColor(Color.parseColor("#22d0c4"))

        }
    }

    inner class viewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val personName: TextView =itemView.name
        val Score: TextView =itemView.points
        val Rank: TextView =itemView.textView14
        val itemm=itemView.item
        val image=itemView.imageView9
    }
}