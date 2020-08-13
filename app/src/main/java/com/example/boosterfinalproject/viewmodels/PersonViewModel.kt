package com.example.boosterfinalproject.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.boosterfinalproject.models.Person
import com.example.boosterfinalproject.repositories.PersonRepository

class PersonViewModel: ViewModel(){
    fun getPersonData(): LiveData<List<Person>> {
        return PersonRepository.getPersonList()
    }
}