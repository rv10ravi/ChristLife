package com.example.christlife

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class Hobbies : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        val name = intent.getStringExtra("Name")

        val nameTextView: TextView = findViewById(R.id.textView6)
        nameTextView.text = "Hobbies of $name"

        // skills
        val skills = arrayOf("C", "JAVA", "PYTHON", "WEB DEV", "MAD")
        val skillsListView: ListView = findViewById(R.id.skillsListView)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, skills)
        skillsListView.adapter = adapter


    }
}