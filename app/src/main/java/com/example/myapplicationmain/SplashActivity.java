package com.example.myapplicationmain;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import java.util.Objects;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        Objects.requireNonNull(getSupportActionBar()).hide();

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );


        Thread thread = new Thread(){
          public void run()
          {
              try {
                  sleep(4000);
              }
              catch (Exception e)
              {
                  e.printStackTrace();

              }
              finally {
                  Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                  startActivity(intent);

              }
          }
        };thread.start();
    }
}