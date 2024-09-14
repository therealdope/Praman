package com.example.praman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Temperature extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
    }

    public void f21(View view){
        Intent intent = new Intent(this, Celsius.class);
        startActivity(intent);
    }
    public void f22(View view){
        Intent intent = new Intent(this, Fahrenheite.class);
        startActivity(intent);
    }
    public void f23(View view){
        Intent intent = new Intent(this, Kelvin.class);
        startActivity(intent);
    }
}