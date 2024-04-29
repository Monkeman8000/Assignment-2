package com.example.assignment2

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class loadingscreen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_loadingscreen2)
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            val intent = Intent(this,Emtyact::class.java)
            startActivity(intent)
        },5000)
        // the amount of time is 5000 seconds
    }
}