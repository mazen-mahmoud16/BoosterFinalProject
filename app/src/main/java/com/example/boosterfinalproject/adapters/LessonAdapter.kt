package com.example.boosterfinalproject.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.boosterfinalproject.R
import com.example.boosterfinalproject.models.Lesson
import com.example.boosterfinalproject.ui.Activities.Congrats
import com.example.boosterfinalproject.ui.Activities.Lesson1refrence
import com.example.boosterfinalproject.ui.Activities.SupportSystem
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
        val start = itemView.start

        fun bindData(lessonToken: Lesson) {
            title.setText(lessonToken.LessonTitle)
            lessonNo.setText(lessonToken.LessonNo)
            description.setText(lessonToken.LessonDesc)

            //if (lessonToken.lessonOpen) {
            start.setBackgroundResource(R.drawable.textback)
            if (lessonToken.LessonType == "Quiz")
                start.text = "Start Quiz"
            else if(lessonToken.LessonType =="Claim your gift!")
                start.text = "Claim your gift!"
            else start.text = "Start"

            start.setOnClickListener() {
                /* if (position < (lessonList.size - 1)) {
                     lessonList[position + 1].lessonOpen = true
                     lessonList[position + 1].LessonType = "Start"
                     start.setBackgroundResource(R.drawable.textback)
                 }*/

                //To open the lesson Quiz
                if (lessonToken.LessonType == "Quiz") {
                    val intent = Intent(context, SupportSystem::class.java)
                    intent.putExtra("lesson", lessonToken.LessonNo)
                    context.startActivity(intent)
                }

                //To open the reward for the user
                else if (lessonToken.LessonType == "Claim your gift!") {
                        val intent = Intent(context, Congrats::class.java)
                        context.startActivity(intent)

                }

                //To open the lesson video
                else {
                    val intent = Intent(context, Lesson1refrence::class.java)
                    intent.putExtra("lesson", lessonToken.LessonNo)
                    context.startActivity(intent)
                }
            }
            //}
        }

    }


}



















