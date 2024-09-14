package com.example.praman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Meter extends AppCompatActivity {

    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meter);
    }

    public void ans12(View view){
        textView = findViewById(R.id.output12);
        editText = findViewById(R.id.input12);
        String s = editText.getText().toString();

        //i am trying float here
//        float cm=Float.parseFloat(s);
        double var=Double.parseDouble(s);
        //write down the answer
        double meters=var;
        double centimeters=meters*100;
        double Kilometers=meters/1000;
        double Inches=meters*39.37;
        double Yards=meters*1.094;
        double foot=meters*3.28084;
        double miles=meters*0.000621;
        textView.setText("Centimeters : \n"+centimeters+"\n\nKilometers : \n"+
                Kilometers+"\n\nInches : \n"+Inches+"\n\nYards : \n"+Yards+"\n\nFoot : \n"+foot+"\n\nMiles : \n"+miles);
    }
}