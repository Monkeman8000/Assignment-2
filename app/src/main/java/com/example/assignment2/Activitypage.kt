package com.example.assignment2

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class Activitypage : AppCompatActivity() {
    private var clickCount = 0
    private var totalButtonCount = 3 // Change this to the total number of buttons on your screen

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_activitypage)
        val btnFeed = findViewById<Button>(R.id.feedbutton)
        val btnclean = findViewById<Button>(R.id.cleanbutton)
        val btnplay = findViewById<Button>(R.id.playbutton)
        val mytextview = findViewById<TextView>(R.id.textView)
        btnFeed.setOnClickListener {
            val intent = Intent(this, FeedActivity::class.java)
            startActivity(intent)
        }
        btnclean.setOnClickListener {
            val intent = Intent(this, CleanActivity::class.java)
            startActivity(intent)
        }
        btnplay.setOnClickListener {
            val intent = Intent(this, PlayActivity::class.java)
            startActivity(intent)
        }


    }



}





