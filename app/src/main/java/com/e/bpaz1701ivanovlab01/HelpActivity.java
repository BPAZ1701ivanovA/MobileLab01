package com.e.bpaz1701ivanovlab01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity
{
    private TextView TextViewGal;
    private TextView TextViewLit;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        //Связь переменных с полями в макете.
        TextViewGal = findViewById(R.id.textViewGal);
        TextViewLit = findViewById(R.id.textViewLit);
        Bundle extras = getIntent().getExtras();
        if (extras != null)
        {
            double gallons = extras.getDouble("GALONI");
            double liters = extras.getDouble("LITRI");
            TextViewGal.setText("Gallons = "+String.valueOf(gallons));
            TextViewLit.setText("Liters = "+String.valueOf(liters));
        }
    }
}