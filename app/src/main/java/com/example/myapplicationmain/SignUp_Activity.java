package com.example.myapplicationmain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;


public class SignUp_Activity extends AppCompatActivity {

    RelativeLayout btnRegister;
    TextView already_have_an_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.startcolorgradient)));
        getSupportActionBar().setTitle("Sign Up");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnRegister = findViewById(R.id.signupregisterbtn);
        already_have_an_account = findViewById(R.id.alreadyhaveanaccount);


        btnRegister.setOnClickListener(view -> {

            Toast.makeText(SignUp_Activity.this, "Your register now", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(SignUp_Activity.this, Signin_Activity.class);
            startActivity(intent);
        });

        already_have_an_account.setOnClickListener(view -> {

            Intent intent = new Intent(SignUp_Activity.this, Signin_Activity.class);
            startActivity(intent);
        });





    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}