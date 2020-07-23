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
        persons.add(Person("Nony", 293.222, 1, R.drawable.ic_launcher_background))
        persons.add(Person("Yaya", 291.222, 2, R.drawable.ic_launcher_background))
        persons.add(Person("Mezu", 290.222, 3, R.drawable.ic_launcher_background))
        persons.add(Person("Marabella", 289.222, 4, R.drawable.ic_launcher_background))
        persons.add(Person("Anoja", 288.222, 5, R.drawable.ic_launcher_background))
        persons.add(Person("Sosy", 260.222, 6, R.drawable.ic_launcher_background))
        return persons
    }
}