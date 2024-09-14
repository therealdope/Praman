package com.example.praman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Celsius extends AppCompatActivity {

    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celsius);
    }

    public void ans21(View view){
        textView = findViewById(R.id.output21);
        editText = findViewById(R.id.input21);
        String s = editText.getText().toString();

        //i am trying float here
        double var=Double.parseDouble(s);
        double celsius=var;
        double fah=(((celsius*9)/5)+32);
        double kelvin=celsius+273.15;
        //write down the answer
        textView.setText("Fahrenheit : \n"+
                fah+"\n\nKelvin : \n"+kelvin);
    }
}