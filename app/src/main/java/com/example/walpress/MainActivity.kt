package com.example.walpress

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var welcText = findViewById<TextView>(R.id.welcomeText)
        welcText.setOnClickListener {
            welcText.animate().apply {
                duration = 1000
                rotationX(360f)
                rotationY(360f)
            }.start()
        }
        var nextPage = findViewById<ImageView>(R.id.arrowRight)
        nextPage.setOnClickListener {
            Toast.makeText(this, "Going on Next Page", Toast.LENGTH_SHORT).show()
        }




    }
}