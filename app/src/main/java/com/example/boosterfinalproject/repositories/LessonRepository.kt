package com.example.boosterfinalproject.repositories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.boosterfinalproject.models.Lesson

object LessonRepository {
    private val lessonList: MutableList<Lesson> = mutableListOf()
    fun getLessonList(): LiveData<List<Lesson>> {
        val lessonLiveData: MutableLiveData<List<Lesson>> = MutableLiveData()
        lessonList.add(
            Lesson(
                "Support System",
                "Lesson 1",
                "Building an integral support system,\n" +
                        "Pushes you to grow, strech more, mainly asks why things wont work, and bullet proofs ideas",
                "Start"
            )
        )
        lessonList.add(
            Lesson(
                "Support System",
                "Lesson 2",
                "These generic visual supports templates " +
                        "will be a gamechanger for you and your students this comprehensive set is perfect for you!",
                "Locked"
            )
        )
        lessonList.add(
            Lesson(
                "Support System",
                "Lesson 3",
                "If you are looking for a fun and " +
                        "innovative way to motivate your students to improve their handwriting, their skills and their abilities! ",
                "Locked"
            )
        )
        lessonList.add(
            Lesson(
                "Support System",
                "Lesson 4",
                "Understanding who you can count on is a key social and emotional " +
                        "skill we can teach early and reinforce through high school.",
                "Locked"
            )
        )
        lessonList.add(
            Lesson(
                "Support System",
                "Lesson 5",
                "These generic visual supports templates " +
                        "will be a gamechanger for you and your students this comprehensive set is perfect for you!",
                "Locked"
            )
        )
        lessonList.add(
            Lesson(
                "Support System",
                "Lesson 1 Quiz",
                "Good Luck",
                "Start Quiz"
            )
        )
        lessonList.add(
            Lesson(
                "Support System",
                "Lesson 2 Quiz",
                "Good Luck",
                "Start Quiz"
            )
        )
        lessonList.add(
            Lesson(
                "Support System",
                "Lesson 3 Quiz",
                "Good Luck",
                "Start Quiz"
            )
        )
        lessonList.add(
            Lesson(
                "Support System",
                "Lesson 4 Quiz",
                "Good Luck",
                "Start Quiz"
            )
        )
        lessonList.add(
            Lesson(
                "Support System",
                "Lesson 5 Quiz",
                "Good Luck",
                "Start Quiz"
            )
        )
        lessonList.add(
            Lesson(
                "Support System", "Finished", "Thanks for finishing the lesson and " +
                        "the quiz!", "Claim your gift!"
            )
        )
        lessonLiveData.postValue(lessonList)
        return lessonLiveData

    }
}