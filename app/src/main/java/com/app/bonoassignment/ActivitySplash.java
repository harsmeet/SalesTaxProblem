package com.app.bonoassignment;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;

public class ActivitySplash extends AppCompatActivity {

    public static final int SPLASH_TIME = 3000;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new CountDownTimer(SPLASH_TIME, 1000) {

            @Override
            public void onFinish() {

                Intent intent = new Intent(getBaseContext(), FirstActivity.class);
                startActivity(intent);
                finish();

            }

            @Override
            public void onTick(long millisUntilFinished) {

            }
        }.start();

    }









}
