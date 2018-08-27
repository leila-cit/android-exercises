package com.example.leila.exercise1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity implements CountdownListener{

    private static final int SPLASH_DISPLAY_TIME = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Timer(SPLASH_DISPLAY_TIME,1000,this).start();

    }

    @Override
    public void onFinish() {
        Intent intent = new Intent();
        intent.setClass(SplashActivity.this,
                MainActivity.class);

        SplashActivity.this.startActivity(intent);
        SplashActivity.this.finish();
    }
}
