package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void first (View v) {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
    public void second (View v) {
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);
    }

}