package com.example.boosterfinalproject

import android.graphics.Paint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_achievementss.*


class Achievements : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_achievements, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val z = getPersons()
        val adapter = Adapter(z)
        main.adapter = adapter
    }

    fun getPersons(): ArrayList<Person> {
        val persons: ArrayList<Person> = ArrayList()
        persons.add(Person("Nourhan", "600,765", 1, R.drawable.girl2))
        persons.add(Person("Yaya", "590,189", 2, R.drawable.jake_img))
        persons.add(Person("Mezu", "460,765", 3, R.drawable.charlie_img))
        persons.add(Person("Marabella", "300,432", 4, R.drawable.emma_img))
        persons.add(Person("Anoja", "100,754", 5, R.drawable.sofia_img))
        persons.add(Person("Sooo", "70,655", 6, R.drawable.girl))
        return persons
    }




}
