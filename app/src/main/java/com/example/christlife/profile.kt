package com.example.christlife


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.widget.Toolbar

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)


        // Find the Toolbar by its ID
        val toolbar: Toolbar = findViewById(R.id.toolbar)

        // Set the Toolbar as the support action bar
        setSupportActionBar(toolbar)

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

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.about_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.welcomepage ->{
                val intent = Intent(this@profile, MainActivity::class.java)
                startActivity(intent)
            }
            R.id.about ->{
                val intent = Intent(this@profile, AboutChrist::class.java)
                startActivity(intent)
            }
            R.id.contact ->{
                val intent = Intent(this@profile, Contact::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }


}