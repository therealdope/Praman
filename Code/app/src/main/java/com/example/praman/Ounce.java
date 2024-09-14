package com.example.praman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Ounce extends AppCompatActivity {

    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ounce);
    }

    public void ans34(View view){
        textView = findViewById(R.id.output34);
        editText = findViewById(R.id.input34);
        String s = editText.getText().toString();

        //i am trying float here
//        float cm=Float.parseFloat(s);
        double var=Double.parseDouble(s);
        //write down the answer
        double kilo=var*0.0283;
        double miligram=kilo*1000000;
        double gram=kilo*1000;
        double ounce=kilo*35.274;
        double pound=kilo*2.205;

        textView.setText("Milligrams : \n"+miligram+"\n\nGrams : \n"+
                gram+"\n\nKilograms : \n"+kilo+"\n\nPounds : \n"+pound);
    }
}