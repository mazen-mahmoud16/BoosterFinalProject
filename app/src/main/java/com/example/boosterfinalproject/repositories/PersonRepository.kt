package com.example.boosterfinalproject.repositories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.boosterfinalproject.R
import com.example.boosterfinalproject.models.Person

object PersonRepository {
    private val personList: MutableList<Person> = mutableListOf()
    fun getPersonList(): LiveData<List<Person>> {
        val personLiveData: MutableLiveData<List<Person>> = MutableLiveData()
        personList.add(
            Person(
                "Nourhan",
                "600,765",
                1,
                R.drawable.girl2
            )
        )
        personList.add(
            Person(
                "Yaya",
                "590,189",
                2,
                R.drawable.jake_img
            )
        )
        personList.add(
            Person(
                "Mezu",
                "460,765",
                3,
                R.drawable.charlie_img
            )
        )
        personList.add(
            Person(
                "Marabella",
                "300,432",
                4,
                R.drawable.emma_img
            )
        )
        personList.add(
            Person(
                "Anoja",
                "100,754",
                5,
                R.drawable.sofia_img
            )
        )
        personList.add(
            Person(
                "Sooo",
                "70,655",
                6,
                R.drawable.girl
            )
        )
        personLiveData.postValue(personList)
        return personLiveData
    }
}