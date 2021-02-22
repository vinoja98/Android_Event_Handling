package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button button;
    TextView text;
    Button home;

    int i = 0;
    @SuppressLint("SetTextI18n")
    private static final String TAG = "ccsl";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate");

        button = findViewById(R.id.btnOk);
        home = findViewById(R.id.homeBtn);

        button.setOnClickListener(this::onClick);
        home.setOnClickListener(this::onClick);

    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.i(TAG, "onStart");
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.i(TAG, "onStop");
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Log.i(TAG, "onRestart");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.i(TAG, "onDestroy");
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.i(TAG, "onResume");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.i(TAG, "onPause");
//    }

    @SuppressLint({"SetTextI18n", "NonConstantResourceId"})
    private void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnOk:
                text = findViewById(R.id.txtHello);
                if (i == 0) {
                    text.setText("Event Changed");
                    i++;
                } else {
                    text.setText("Hello User");
                    i = 0;
                }
                break;
            case R.id.homeBtn:
                Intent i = new Intent(getApplicationContext(), Home.class);
                startActivity(i);
                break;

            default:
                break;
        }
    }

}