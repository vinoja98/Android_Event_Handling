package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    Button back, sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        back=findViewById(R.id.backBtn);
        sign =findViewById(R.id.button5);

        back.setOnClickListener(this::onClick);
        sign.setOnClickListener(this::onClick);
    }
    @SuppressLint("NonConstantResourceId")
    private void onClick(View v) {
        switch (v.getId()) {
            case R.id.backBtn:

                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);

                break;
            case R.id.button5:
                Intent i2 = new Intent(getApplicationContext(),SignUp.class);
                startActivity(i2);
                break;

            default:
                break;
        }
    }

}