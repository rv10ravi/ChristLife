package com.example.christlife

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Hobbies : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        val name = intent.getStringExtra("Name")

        val nameTextView: TextView = findViewById(R.id.textView6)
        nameTextView.text = "Hobbies of $name"
    }
}