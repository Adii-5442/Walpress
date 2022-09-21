package com.example.walpress

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fun main(args : Array<String>) {
            println("Kotlin is interesting.")
        }
        Log.e("Attention","My name is aditya")
        for(i in 1..10){
            println(i)
        }






        setContentView(R.layout.activity_main)
    }
}