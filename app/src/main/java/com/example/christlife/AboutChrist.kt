package com.example.christlife

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import android.widget.VideoView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.PopupMenu

class AboutChrist : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_christ)

        val popupImgBtn: ImageButton = findViewById(R.id.popupImgBtn)

        // Set click listener for the ImageButton
        popupImgBtn.setOnClickListener { v ->
            // Create a PopupMenu
            val popupMenu = PopupMenu(this@AboutChrist, v)
            popupMenu.inflate(R.menu.social_menu) // Inflate the menu resource
            popupMenu.setOnMenuItemClickListener { item ->
                // Handle menu item clicks
                when (item.itemId) {
                    R.id.instagram -> {
                        val instagramUri = Uri.parse("https://www.instagram.com/christ_university_bangalore/")
                        val instagramIntent = Intent(Intent.ACTION_VIEW, instagramUri)
                        startActivity(instagramIntent)

                        true
                    }
                    R.id.linkedin -> {
                        val instagramUri = Uri.parse("https://in.linkedin.com/")
                        val instagramIntent = Intent(Intent.ACTION_VIEW, instagramUri)
                        startActivity(instagramIntent)

                        true
                    }
                    R.id.youtube -> {
                        val instagramUri = Uri.parse("https://youtu.be/ijYARC4AhDc?si=c3b7akN2Scd8AlPi")
                        val instagramIntent = Intent(Intent.ACTION_VIEW, instagramUri)
                        startActivity(instagramIntent)

                        true
                    }
                    else -> false
                }
            }

            // Show the popup menu
            popupMenu.show()
        }

        loadYouTubeVideo()

        lateinit var videoView: VideoView
        videoView = findViewById<VideoView>(R.id.videoView)
        val videoUri = Uri.parse("android.resource://" + packageName + "/" + R.raw.sample_video)
        videoView.setVideoURI(videoUri)
        videoView.start()
        videoView.stopPlayback()

        // Initialize the button
        val notificationButton: Button = findViewById(R.id.notifyButton)
        notificationButton.setOnClickListener {
            showNotificationDialog()
        }

    }

    private fun loadYouTubeVideo() {
        val webView: WebView = findViewById(R.id.webView)
        webView.settings.javaScriptEnabled = true
        webView.webChromeClient = WebChromeClient()
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://youtu.be/ijYARC4AhDc?si=vVgXQmjdUUI-3FpI")
    }
    private fun showNotificationDialog() {
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle("Notification")
        alertDialogBuilder.setMessage("Do you want to enable notifications?")
        alertDialogBuilder.setPositiveButton("Yes") { dialog, which ->
            // Handle positive button click
            // You can add your logic here to enable notifications
            Toast.makeText(this, "Notifications enabled", Toast.LENGTH_SHORT).show()
        }
        alertDialogBuilder.setNegativeButton("No") { dialog, which ->
            // Handle negative button click
            // You can add your logic here for not enabling notifications
            Toast.makeText(this, "Notifications disabled", Toast.LENGTH_SHORT).show()
        }

        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }
}