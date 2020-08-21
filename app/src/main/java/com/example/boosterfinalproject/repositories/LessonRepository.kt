package com.example.boosterfinalproject.repositories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.boosterfinalproject.models.Lesson

object LessonRepository {
    private val lessonList: MutableList<Lesson> = mutableListOf()
    private val lessonList2: MutableList<Lesson> = mutableListOf()
    private val lessonList3: MutableList<Lesson> = mutableListOf()
    private val lessonList4: MutableList<Lesson> = mutableListOf()


    fun getLessonList(): LiveData<List<Lesson>> {
        val lessonLiveData: MutableLiveData<List<Lesson>> = MutableLiveData()
        if(lessonList.size==0) {
            lessonList.add(
                Lesson(
                    "Support System",
                    "Lesson 1",
                    "Building an integral support system,\n" +
                            "Pushes you to grow, strech more, mainly asks why things wont work, and bullet proofs ideas",
                    "Lesson", true
                )
            )
            lessonList.add(
                Lesson(
                    "Support System",
                    "Lesson 1 Quiz",
                    "Good Luck",
                    "Quiz"
                )
            )
            lessonList.add(
                Lesson(
                    "Support System",
                    "Lesson 2",
                    "These generic visual supports templates " +
                            "will be a gamechanger for you and your students this comprehensive set is perfect for you!",
                    "Lesson"
                )
            )
            lessonList.add(
                Lesson(
                    "Support System",
                    "Lesson 2 Quiz",
                    "Good Luck",
                    "Quiz"
                )
            )
            lessonList.add(
                Lesson(
                    "Support System",
                    "Lesson 3",
                    "If you are looking for a fun and " +
                            "innovative way to motivate your students to improve their handwriting, their skills and their abilities! ",
                    "Lesson"
                )
            )
            lessonList.add(
                Lesson(
                    "Support System",
                    "Lesson 3 Quiz",
                    "Good Luck",
                    "Quiz"
                )
            )
            lessonList.add(
                Lesson(
                    "Support System",
                    "Lesson 4",
                    "Understanding who you can count on is a key social and emotional " +
                            "skill we can teach early and reinforce through high school.",
                    "Lesson"
                )
            )
            lessonList.add(
                Lesson(
                    "Support System",
                    "Lesson 4 Quiz",
                    "Good Luck",
                    "Quiz"
                )
            )
            lessonList.add(
                Lesson(
                    "Support System",
                    "Lesson 5",
                    "These generic visual supports templates " +
                            "will be a gamechanger for you and your students this comprehensive set is perfect for you!",
                    "Lesson"
                )
            )
            lessonList.add(
                Lesson(
                    "Support System",
                    "Lesson 5 Quiz",
                    "Good Luck",
                    "Quiz"
                )
            )
            lessonList.add(
                Lesson(
                    "Support System", "Finished", "Thanks for finishing the lesson and " +
                            "the quiz!", "Claim your gift!"
                )
            )
        }
        lessonLiveData.postValue(lessonList)
        return lessonLiveData

    }
    fun getLessonListCore(): LiveData<List<Lesson>> {
        val lessonLiveData: MutableLiveData<List<Lesson>> = MutableLiveData()
        if(lessonList2.size==0) {
            lessonList2.add(
                Lesson(
                    "Core Value",
                    "Lesson 1",
                    "Building an integral support system,\n" +
                            "Pushes you to grow, strech more, mainly asks why things wont work, and bullet proofs ideas",
                    "Lesson", true
                )
            )
            lessonList2.add(
                Lesson(
                    "Core Value",
                    "Lesson 1 Quiz",
                    "Good Luck",
                    "Quiz"
                )
            )
            lessonList2.add(
                Lesson(
                    "Core Value",
                    "Lesson 2",
                    "These generic visual supports templates " +
                            "will be a gamechanger for you and your students this comprehensive set is perfect for you!",
                    "Lesson"
                )
            )
            lessonList2.add(
                Lesson(
                    "Core Value",
                    "Lesson 2 Quiz",
                    "Good Luck",
                    "Quiz"
                )
            )
            lessonList2.add(
                Lesson(
                    "Core Value",
                    "Lesson 3",
                    "If you are looking for a fun and " +
                            "innovative way to motivate your students to improve their handwriting, their skills and their abilities! ",
                    "Lesson"
                )
            )
            lessonList2.add(
                Lesson(
                    "Core Value",
                    "Lesson 3 Quiz",
                    "Good Luck",
                    "Quiz"
                )
            )
            lessonList2.add(
                Lesson(
                    "Core Value",
                    "Lesson 4",
                    "Understanding who you can count on is a key social and emotional " +
                            "skill we can teach early and reinforce through high school.",
                    "Lesson"
                )
            )
            lessonList2.add(
                Lesson(
                    "Core Value",
                    "Lesson 4 Quiz",
                    "Good Luck",
                    "Quiz"
                )
            )
            lessonList2.add(
                Lesson(
                    "Core Value",
                    "Lesson 5",
                    "These generic visual supports templates " +
                            "will be a gamechanger for you and your students this comprehensive set is perfect for you!",
                    "Lesson"
                )
            )
            lessonList2.add(
                Lesson(
                    "Core Value",
                    "Lesson 5 Quiz",
                    "Good Luck",
                    "Quiz"
                )
            )
            lessonList2.add(
                Lesson(
                    "Core Value", "Finished", "Thanks for finishing the lesson and " +
                            "the quiz!", "Claim your gift!"
                )
            )
        }
        lessonLiveData.postValue(lessonList2)
        return lessonLiveData

    }
    fun getLessonListWeak(): LiveData<List<Lesson>> {
        val lessonLiveData: MutableLiveData<List<Lesson>> = MutableLiveData()
        if(lessonList3.size==0) {
            lessonList3.add(
                Lesson(
                    "Strength-Weakness",
                    "Lesson 1",
                    "Building an integral support system,\n" +
                            "Pushes you to grow, strech more, mainly asks why things wont work, and bullet proofs ideas",
                    "Lesson", true
                )
            )
            lessonList3.add(
                Lesson(
                    "Strength-Weakness",
                    "Lesson 1 Quiz",
                    "Good Luck",
                    "Quiz"
                )
            )
            lessonList3.add(
                Lesson(
                    "Strength-Weakness",
                    "Lesson 2",
                    "These generic visual supports templates " +
                            "will be a gamechanger for you and your students this comprehensive set is perfect for you!",
                    "Lesson"
                )
            )
            lessonList3.add(
                Lesson(
                    "Strength-Weakness",
                    "Lesson 2 Quiz",
                    "Good Luck",
                    "Quiz"
                )
            )
            lessonList3.add(
                Lesson(
                    "Strength-Weakness",
                    "Lesson 3",
                    "If you are looking for a fun and " +
                            "innovative way to motivate your students to improve their handwriting, their skills and their abilities! ",
                    "Lesson"
                )
            )
            lessonList3.add(
                Lesson(
                    "Strength-Weakness",
                    "Lesson 3 Quiz",
                    "Good Luck",
                    "Quiz"
                )
            )
            lessonList3.add(
                Lesson(
                    "Core Value",
                    "Lesson 4",
                    "Understanding who you can count on is a key social and emotional " +
                            "skill we can teach early and reinforce through high school.",
                    "Lesson"
                )
            )
            lessonList3.add(
                Lesson(
                    "Strength-Weakness",
                    "Lesson 4 Quiz",
                    "Good Luck",
                    "Quiz"
                )
            )
            lessonList3.add(
                Lesson(
                    "Strength-Weakness",
                    "Lesson 5",
                    "These generic visual supports templates " +
                            "will be a gamechanger for you and your students this comprehensive set is perfect for you!",
                    "Lesson"
                )
            )
            lessonList3.add(
                Lesson(
                    "Strength-Weakness",
                    "Lesson 5 Quiz",
                    "Good Luck",
                    "Quiz"
                )
            )
            lessonList3.add(
                Lesson(
                    "Strength-Weakness", "Finished", "Thanks for finishing the lesson and " +
                            "the quiz!", "Claim your gift!"
                )
            )
        }
        lessonLiveData.postValue(lessonList3)
        return lessonLiveData

    }
    fun getLessonListGoals(): LiveData<List<Lesson>> {
        val lessonLiveData: MutableLiveData<List<Lesson>> = MutableLiveData()
        if(lessonList4.size==0) {
            lessonList4.add(
                Lesson(
                    "Goals and Aspiration",
                    "Lesson 1",
                    "Building an integral support system,\n" +
                            "Pushes you to grow, strech more, mainly asks why things wont work, and bullet proofs ideas",
                    "Lesson", true
                )
            )
            lessonList4.add(
                Lesson(
                    "Goals and Aspiration",
                    "Lesson 1 Quiz",
                    "Good Luck",
                    "Quiz"
                )
            )
            lessonList4.add(
                Lesson(
                    "Goals and Aspiration",
                    "Lesson 2",
                    "These generic visual supports templates " +
                            "will be a gamechanger for you and your students this comprehensive set is perfect for you!",
                    "Lesson"
                )
            )
            lessonList4.add(
                Lesson(
                    "Goals and Aspiration",
                    "Lesson 2 Quiz",
                    "Good Luck",
                    "Quiz"
                )
            )
            lessonList4.add(
                Lesson(
                    "Goals and Aspiration",
                    "Lesson 3",
                    "If you are looking for a fun and " +
                            "innovative way to motivate your students to improve their handwriting, their skills and their abilities! ",
                    "Lesson"
                )
            )
            lessonList4.add(
                Lesson(
                    "Goals and Aspiration",
                    "Lesson 3 Quiz",
                    "Good Luck",
                    "Quiz"
                )
            )
            lessonList4.add(
                Lesson(
                    "Goals and Aspiration",
                    "Lesson 4",
                    "Understanding who you can count on is a key social and emotional " +
                            "skill we can teach early and reinforce through high school.",
                    "Lesson"
                )
            )
            lessonList4.add(
                Lesson(
                    "Goals and Aspiration",
                    "Lesson 4 Quiz",
                    "Good Luck",
                    "Quiz"
                )
            )
            lessonList4.add(
                Lesson(
                    "Goals and Aspiration",
                    "Lesson 5",
                    "These generic visual supports templates " +
                            "will be a gamechanger for you and your students this comprehensive set is perfect for you!",
                    "Lesson"
                )
            )
            lessonList4.add(
                Lesson(
                    "Goals and Aspiration",
                    "Lesson 5 Quiz",
                    "Good Luck",
                    "Quiz"
                )
            )
            lessonList4.add(
                Lesson(
                    "Goals and Aspiration", "Finished", "Thanks for finishing the lesson and " +
                            "the quiz!", "Claim your gift!"
                )
            )
        }
        lessonLiveData.postValue(lessonList4)
        return lessonLiveData
    }

    //These 5 functions contains the description of the 5 videos
    fun getlesson1Intro(): String{
        return "This lesson helps you to understand what is the meaning of recyclerview, which many developers are afraid of" +
                "and do not understand it correctly which makes it so complicated for the developers."
    }
    fun getlesson2Intro(): String{
        return "This lesson we will try to implement the recyclerview in arabic. It is recommended if you do not watch the first video carefully" +
                ", to open it and watch it again, as this lesson depends on the first lesson."
    }
    fun getlesson3Intro(): String{
        return "You should learn in this lesson how to make a file template. This lesson is in Arabic."
    }
    fun getlesson4Intro(): String{
        return "This lesson we will try to make you understand retrofit, as it is so important for the developers nowadays and " +
                "most of the jobs requires to implement retrofit to get data from internet."
    }
    fun getlesson5Intro(): String{
        return "In this lesson we will try to implement the retofit discussed in lesson 4 in android studio " +
        "with ots interfaces. It is recommended to understand lesson 4 properly before watching this video."
    }
}