package com.hardware.myapplication

import android.content.Intent
import android.os.Bundle

import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Hospital : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_hospital)

        val apploe = findViewById<TextView>(R.id.applo_btn)
        apploe.setOnClickListener {

            val intent1 = Intent(this,Docter::class.java)
            startActivity(intent1)

        }
    }
}