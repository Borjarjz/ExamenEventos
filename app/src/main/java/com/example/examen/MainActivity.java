package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mEmailView=null;
    TextView mPasswordView=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }





    public void goToSecondActivity(View view) {

        mEmailView=(AutoCompleteTextView) findViewById(R.id.usernameEditText);
        mPasswordView=findViewById(R.id.passwordEditText);


        Intent intent = new Intent(this, ActivityLogin.class);
        startActivity(intent);
    }
}