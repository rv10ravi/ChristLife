package com.example.christlife

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this@MainActivity, profile::class.java)
            startActivity(intent)
        }

        val imageButton1: ImageButton = findViewById(R.id.imageButton1)
        imageButton1.setOnClickListener {
            val instagramUri = Uri.parse("https://christuniversity.in/") // Replace with your Instagram link
            val instagramIntent = Intent(Intent.ACTION_VIEW, instagramUri)
            startActivity(instagramIntent)
        }

        val imageButton2: ImageButton = findViewById(R.id.imageButton2)
        imageButton2.setOnClickListener {
            val instagramUri = Uri.parse("https://www.instagram.com/christ_university_bangalore/") // Replace with your Instagram link
            val instagramIntent = Intent(Intent.ACTION_VIEW, instagramUri)
            startActivity(instagramIntent)
        }

        // Registering context menu for imageButton2
        registerForContextMenu(imageButton2)

    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.context_menu, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.option1 -> {
                val instagramUri = Uri.parse("https://www.instagram.com/christ_university_bangalore/")
                val instagramIntent = Intent(Intent.ACTION_VIEW, instagramUri)
                startActivity(instagramIntent)
                return true
            }
            R.id.option2 -> {
                val instagramUri = Uri.parse("https://www.instagram.com/christ_university_lavasa/")
                val instagramIntent = Intent(Intent.ACTION_VIEW, instagramUri)
                startActivity(instagramIntent)
                return true
            }
            R.id.option3 -> {
                val instagramUri = Uri.parse("https://www.instagram.com/christuniversity_kengeri/")
                val instagramIntent = Intent(Intent.ACTION_VIEW, instagramUri)
                startActivity(instagramIntent)
                return true
            }
            else -> return super.onContextItemSelected(item)
        }
    }
}

