package com.example.boosterfinalproject.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.boosterfinalproject.models.Lesson
import com.example.boosterfinalproject.repositories.LessonRepository

class LessonViewModel : ViewModel(){
    fun getLessonData(): LiveData<List<Lesson>> {
        return LessonRepository.getLessonList()
    }
}