package com.example.boosterfinalproject

import android.content.Intent
import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_achievementss.*
import kotlinx.android.synthetic.main.item.*

class achievementss : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_achievementss)
        supportActionBar?.hide()
        leaderbord.paintFlags = Paint.UNDERLINE_TEXT_FLAG

        val z = getPersons()
        val adapter = Adapter(z)
        main.adapter = adapter

    }

    fun getPersons(): ArrayList<Person> {
        val persons: ArrayList<Person> = ArrayList()
        persons.add(Person("Nony", "600,765", 1, R.drawable.girl))
        persons.add(Person("Yaya", "590,189", 2, R.drawable.jake_img))
        persons.add(Person("Mezu", "460,765", 3, R.drawable.charlie_img))
        persons.add(Person("Marabella", "300,432", 4, R.drawable.emma_img))
        persons.add(Person("Anoja", "100,754", 5, R.drawable.sofia_img))
        persons.add(Person("Sosy", "70,655", 6, R.drawable.girl2))
        return persons
    }
}