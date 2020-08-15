package com.example.boosterfinalproject.models

data class Lesson(
    val LessonTitle: String,
    val LessonNo: String,
    val LessonDesc: String,
    var LessonType: String,
    var lessonOpen: Boolean = false
)
