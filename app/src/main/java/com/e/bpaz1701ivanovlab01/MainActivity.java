package com.e.bpaz1701ivanovlab01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
//НУЖНЫЙ импорт для двух переменных далее.
import android.widget.EditText;
import android.widget.TextView;
//НУЖНЫЙ импорт для целого метода.
import android.view.View;
//НУЖНЫЙ импорт для HelpActivity.
import android.content.Intent;

public class MainActivity extends AppCompatActivity
{
    //Объявление переменных.
    private EditText EditText;
    private TextView TextView;
    double liters;
    double gallons;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Связь переменных с полями в макете.
        EditText = findViewById(R.id.editText);
        TextView = findViewById(R.id.result);
    }
    public void onButtonClick1(View v)
    {
        liters = Double.parseDouble(EditText.getText().toString());
        gallons = liters * 0.264172;
        TextView.setText(String.valueOf(gallons));
    }
    public void onButtonClick2(View v)
    {
        Intent i = new Intent(MainActivity.this, HelpActivity.class);
        i.putExtra("GALONI", gallons);
        i.putExtra("LITRI", liters);
        startActivity(i);
    }
}