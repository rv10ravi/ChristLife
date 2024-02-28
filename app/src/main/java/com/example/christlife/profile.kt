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

        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener {
            val intent = Intent(this@profile, Contact::class.java)
            startActivity(intent)
        }
        val button5: Button = findViewById(R.id.button5)
        button5.setOnClickListener {
            val intent = Intent(this@profile, AboutChrist::class.java)
            startActivity(intent)
        }
    }


}