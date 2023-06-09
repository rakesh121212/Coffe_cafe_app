package com.example.myapplicationmain;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    RelativeLayout login, register;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // transparent Actionbar

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

        Objects.requireNonNull(getSupportActionBar()).hide();

        login = findViewById(R.id.btnlogin);
        register = findViewById(R.id.btnregisterom);

        login.setOnClickListener(view -> {

            Toast.makeText(MainActivity.this, "Login has been clicked", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(MainActivity.this, Signin_Activity.class);
            startActivity(intent);


        });

        register.setOnClickListener(view -> {

            Toast.makeText(MainActivity.this, "Register has been clicked", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(MainActivity.this, SignUp_Activity.class);
            startActivity(intent);
        });







    }
}