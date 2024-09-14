package com.example.praman;

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
    public void f1(View view){
        Intent intent = new Intent(this,Length.class);
        startActivity(intent);
    }
    public void f2(View view){
        Intent intent = new Intent(this,Temperature.class);
        startActivity(intent);
    }
    public void f3(View view){
        Intent intent = new Intent(this, Weight.class);
        startActivity(intent);
    }
}