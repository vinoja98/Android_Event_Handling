package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication2.Database.DBHandler;

import static java.security.AccessController.getContext;

public class SignUp extends AppCompatActivity {
    Button back,register;
    EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        back=findViewById(R.id.button2);
        register=findViewById(R.id.button);
        username=findViewById(R.id.editTextTextPersonName);
        password=findViewById(R.id.editTextTextPassword);
        back.setOnClickListener(this::onClick);
        register.setOnClickListener(this::onClick);
    }
    private void onClick(View v) {
        if (v.getId() == R.id.button2) {
            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);
        }
        if (v.getId() == R.id.button) {
            DBHandler dbHelper = new DBHandler(getApplicationContext());
            long newId=dbHelper.add_info(username.getText().toString(),password.getText().toString());
            Toast.makeText(SignUp.this, "User Added.", Toast.LENGTH_SHORT).show();

            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);
        }
    }
}