package com.example.christlife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val button: Button = findViewById(R.id.button2)
        button.setOnClickListener {
            val intent = Intent(this@profile, Hobbies::class.java)
            intent.putExtra("Name", "Ravi")
            startActivity(intent)
        }
    }


}