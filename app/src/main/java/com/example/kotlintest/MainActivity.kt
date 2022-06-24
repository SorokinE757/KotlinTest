package com.example.kotlintest

import android.app.Person
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.do_dz_btn).setOnClickListener(this)
    }
    private val firstPerson = Person("Евгений", "Сорокин")
    private val secondPerson = firstPerson.copy(name = "Александр")

    override fun onClick(p0: View?) {
        findViewById<TextView>(R.id.tf1).text = firstPerson.name
        findViewById<TextView>(R.id.tf2).text = firstPerson.surname
        findViewById<TextView>(R.id.tf3).text = secondPerson.name
        findViewById<TextView>(R.id.tf4).text = secondPerson.surname
    }
}