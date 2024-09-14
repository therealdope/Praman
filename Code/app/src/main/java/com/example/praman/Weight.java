package com.example.praman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Weight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
    }

    public void f31(View view){
        Intent intent = new Intent(this, Milligram.class);
        startActivity(intent);
    }
    public void f32(View view){
        Intent intent = new Intent(this, Gram.class);
        startActivity(intent);
    }
    public void f33(View view){
        Intent intent = new Intent(this, Kilogram.class);
        startActivity(intent);
    }
    public void f34(View view){
        Intent intent = new Intent(this, Ounce.class);
        startActivity(intent);
    }
    public void f35(View view){
        Intent intent = new Intent(this, Pound.class);
        startActivity(intent);
    }
}