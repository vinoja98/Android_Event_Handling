package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        back=findViewById(R.id.backBtn);

        back.setOnClickListener(this::onClick);
    }

    private void onClick(View v) {

        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);

    }
}