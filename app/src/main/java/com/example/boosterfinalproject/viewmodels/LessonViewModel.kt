package com.example.boosterfinalproject.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.boosterfinalproject.models.Lesson
import com.example.boosterfinalproject.repositories.LessonRepository

class LessonViewModel : ViewModel(){
    fun getLessonDataSupport(): LiveData<List<Lesson>> {
        return LessonRepository.getLessonList()
    }
    fun getLessonDataCore(): LiveData<List<Lesson>> {
        return LessonRepository.getLessonListCore()
    }
    fun getLessonDataWeak(): LiveData<List<Lesson>> {
        return LessonRepository.getLessonListWeak()
    }
    fun getLessonDataGoals(): LiveData<List<Lesson>> {
        return LessonRepository.getLessonListGoals()
    }
    //This static variable to decide which video on youtube the user will see
    companion object {
        var videoID="za2oNpHjYL8"
    }


}