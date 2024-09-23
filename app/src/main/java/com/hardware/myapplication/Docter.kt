package com.hardware.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button

import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Docter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_docter)

        val agencyforwardbutton = findViewById<Button>(R.id.book)
        agencyforwardbutton.setOnClickListener{

            val intent1 = Intent(this, Final::class.java)
            startActivity(intent1)
        }
    }
}