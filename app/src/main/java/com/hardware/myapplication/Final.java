package com.hardware.myapplication;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;


public class Final extends AppCompatActivity {

    LottieAnimationView lottie;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        lottie = findViewById(R.id.lot);






        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {







            }
        },4000);

    }
}