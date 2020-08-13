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

class LessonAdapter(val context: Context, val lessonList: List<Lesson>) :
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
        holder.bindData(lessonList[position])
    }


    //*********************************************************************************************
    inner class DataItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title = itemView.system
        val lessonNo = itemView.lesson
        val description = itemView.desc
        val buttonn = itemView.start
        val start = itemView.start

        fun bindData(lessonToken:Lesson){
            title.setText(lessonToken.LessonTitle)
            lessonNo.setText(lessonToken.LessonNo)
            description.setText(lessonToken.LessonDesc)
            buttonn.setText(lessonToken.ButtonLesson)

            //To open the lesson Quiz
            if (lessonToken.ButtonLesson == "Start Quiz") {
                start.setOnClickListener() {
                    val intent = Intent(context, SupportSystem::class.java)
                    intent.putExtra("lesson",lessonNo.text.toString())
                    context.startActivity(intent)
                }

                //To open the reward for the user
            } else if (lessonToken.ButtonLesson == "Claim your gift!") {
                start.setOnClickListener() {
                    val intent = Intent(context, Congrats::class.java)
                    context.startActivity(intent)
                }
            } else {
                //To open the lesson video
                start.setOnClickListener() {
                    val intent = Intent(context, Lesson1refrence::class.java)
                    intent.putExtra("lesson",lessonNo.text.toString())
                    context.startActivity(intent)
                }
            }
        }
    }


}



















