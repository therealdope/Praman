package com.example.praman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Yard extends AppCompatActivity {

    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yard);
    }

    public void ans15(View view){
        textView = findViewById(R.id.output15);
        editText = findViewById(R.id.input15);
        String s = editText.getText().toString();

        //i am trying float here
//        float cm=Float.parseFloat(s);
        double var=Double.parseDouble(s);
        //write down the answer
        double meters=var*0.914;
        double centimeters=meters*100;
        double Kilometers=meters/1000;
        double Inches=meters*39.37;
        double Yards=meters*1.094;
        double foot=meters*3.28084;
        double miles=meters*0.000621;
        textView.setText("Centimeters : \n"+centimeters+"\n\nMeters : \n"+meters+"\n\nKilometers : \n"+
                Kilometers+"\n\nInches : \n"+Inches+"\n\nFoot : \n"+foot+"\n\nMiles : \n"+miles);
    }
}