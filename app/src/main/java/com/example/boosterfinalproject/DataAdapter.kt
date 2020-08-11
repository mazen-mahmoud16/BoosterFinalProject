package com.example.boosterfinalproject

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.cardvieww.view.*

class DataAdapter(val context: Context, val DataList: ArrayList<Data>) :
    RecyclerView.Adapter<DataAdapter.DataItemViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val DataItemView = layoutInflater.inflate(R.layout.cardvieww, parent, false)
        return DataItemViewHolder(DataItemView)
    }

    override fun getItemCount(): Int {
        return DataList.size
    }

    override fun onBindViewHolder(holder: DataItemViewHolder, position: Int) {
        val dataa: Data = DataList.get(position)


        holder.title.setText(dataa.LessonTitle)
        holder.lessonNo.setText(dataa.LessonNo)
        holder.description.setText(dataa.LessonDesc)
        holder.buttonn.setText(dataa.ButtonLesson)
        if (dataa.ButtonLesson == "Start Quiz") {
            holder.start.setOnClickListener() {
                val intent = Intent(context, support_system::class.java)
                context.startActivity(intent)
            }
        } else if (dataa.ButtonLesson == "Claim your gift!") {
            holder.start.setOnClickListener() {
                val intent = Intent(context, Congrats::class.java)
                context.startActivity(intent)
            }
        } else {
            holder.start.setOnClickListener() {
                val intent = Intent(context, lesson1refrence::class.java)
                context.startActivity(intent)
            }
        }


    }


    //*********************************************************************************************
    inner class DataItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title = itemView.system
        val lessonNo = itemView.lesson
        val description = itemView.desc
        val buttonn = itemView.start
        val start = itemView.start
    }


}



















