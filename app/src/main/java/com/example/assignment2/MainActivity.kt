package com.example.assignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
       val btnStart = findViewById<Button>(R.id.button)
        btnStart.setOnClickListener {
            val intent = Intent(this,Activitypage::class.java)
            startActivity(intent)
        }
        }
    }
