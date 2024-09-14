package com.example.praman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Gram extends AppCompatActivity {

    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gram);
    }

    public void ans32(View view){
        textView = findViewById(R.id.output32);
        editText = findViewById(R.id.input32);
        String s = editText.getText().toString();

        //i am trying float here
//        float cm=Float.parseFloat(s);
        double var=Double.parseDouble(s);
        //write down the answer
        double kilo=var/1000;
        double miligram=kilo*1000000;
        double gram=kilo*1000;
        double ounce=kilo*35.274;
        double pound=kilo*2.205;

        textView.setText("Milligrams : \n"+miligram+"\n\nKilograms : \n"+kilo+"\n\nOunces : \n"+ounce+"\n\nPounds : \n"+pound);
    }
}