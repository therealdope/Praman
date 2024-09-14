package com.example.praman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Length extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
    }
    public void f11(View view){
        Intent intent = new Intent(this, Centimeter.class);
        startActivity(intent);
    }
    public void f12(View view){
        Intent intent = new Intent(this, Meter.class);
        startActivity(intent);
    }
    public void f13(View view){
        Intent intent = new Intent(this, Kilometer.class);
        startActivity(intent);
    }
    public void f14(View view){
        Intent intent = new Intent(this, Inch.class);
        startActivity(intent);
    }
    public void f15(View view){
        Intent intent = new Intent(this,Yard.class);
        startActivity(intent);
    }
    public void f16(View view){
        Intent intent = new Intent(this, Foot.class);
        startActivity(intent);
    }
    public void f17(View view){
        Intent intent = new Intent(this, Mile.class);
        startActivity(intent);
    }
}