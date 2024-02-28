package com.example.christlife

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.RatingBar
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Contact : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val myWebView: WebView = findViewById(R.id.webview)
        myWebView.loadUrl("https://github.com/")

        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)

        // Set a rating change listener
        ratingBar.setOnRatingBarChangeListener { _, rating, _ ->
            // Handle the rating change event here
            Toast.makeText(this, "Rating: $rating", Toast.LENGTH_SHORT).show()
        }

        val floatingActionButton = findViewById<FloatingActionButton>(R.id.floatingActionButton2)

        floatingActionButton.setOnClickListener {
            // Create intent to open the dial pad with the number
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:9938938923")
            startActivity(intent)
        }
    }
}