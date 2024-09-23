package com.hardware.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import com.airbnb.lottie.LottieAnimationView
import com.hardware.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)

        mainBinding.signupmain.setOnClickListener {
            val intent = Intent(this@MainActivity, Admin::class.java)
            startActivity(intent)
        }


        val userforwardbutton = findViewById<Button>(R.id.loginmain)
        userforwardbutton.setOnClickListener{

            val intent1 = Intent(this, UserPage::class.java)
            startActivity(intent1)
        }


            var lottin = findViewById<LottieAnimationView?>(R.id.lottie1)



            Handler().postDelayed({
                val i = Intent(
                    applicationContext,
                    MainActivity::class.java
                )
                startActivity(i)
            }, 3000000)

        }

    }

