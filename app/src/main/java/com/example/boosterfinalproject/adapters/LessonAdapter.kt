package com.example.boosterfinalproject.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.boosterfinalproject.ui.Activities.Congrats
import com.example.boosterfinalproject.ui.Activities.Lesson1refrence
import com.example.boosterfinalproject.R
import com.example.boosterfinalproject.ui.Activities.SupportSystem
import com.example.boosterfinalproject.models.Lesson
import kotlinx.android.synthetic.main.cardvieww.view.*

class LessonAdapter(val context: Context, val lessonList: ArrayList<Lesson>) :
    RecyclerView.Adapter<LessonAdapter.DataItemViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val DataItemView = layoutInflater.inflate(R.layout.cardvieww, parent, false)
        return DataItemViewHolder(DataItemView)
    }

    override fun getItemCount(): Int {
        return lessonList.size
    }

    override fun onBindViewHolder(holder: DataItemViewHolder, position: Int) {
        val dataa: Lesson = lessonList.get(position)


        holder.title.setText(dataa.LessonTitle)
        holder.lessonNo.setText(dataa.LessonNo)
        holder.description.setText(dataa.LessonDesc)
        holder.buttonn.setText(dataa.ButtonLesson)
        if (dataa.ButtonLesson == "Start Quiz") {
            holder.start.setOnClickListener() {
                val intent = Intent(context, SupportSystem::class.java)
                intent.putExtra("lesson",holder.lessonNo.text.toString())
                context.startActivity(intent)
            }
        } else if (dataa.ButtonLesson == "Claim your gift!") {
            holder.start.setOnClickListener() {
                val intent = Intent(context, Congrats::class.java)
                context.startActivity(intent)
            }
        } else {
            holder.start.setOnClickListener() {
                val intent = Intent(context, Lesson1refrence::class.java)
                intent.putExtra("lesson",holder.lessonNo.text.toString())
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



















