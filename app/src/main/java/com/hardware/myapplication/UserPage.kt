package com.hardware.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class UserPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_page)

        val Dental = findViewById<Button>(R.id.dental_button)
        Dental.setOnClickListener {

            val intent1 = Intent(this, Hospital::class.java)
            startActivity(intent1)


        }
    }}