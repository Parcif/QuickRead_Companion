package com.example.main.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.main.utils.TextDisplay;
import com.example.quickreadcompanion.R;

import java.util.ArrayList;

public class TextDisplayActivity extends AppCompatActivity
{
    private TextView text_display;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_display);

        text_display = findViewById(R.id.text_display);


        int reading_speed = 250; // переменная скорости чтения
        double input_speed = 250; // переменная, которую будем проверять

        try {
            reading_speed = Integer.parseInt(String.valueOf(input_speed));
        } catch (NumberFormatException ex) {
            System.out.println("Input is not an int value"); // желательно Sout поменять на вывод на экран приложения
        }

        if(reading_speed <= 0){
            System.out.println("Number is negative"); // тут аналогично
        }


        Intent intern = getIntent();
        ArrayList<String> words = intern.getStringArrayListExtra("words");

        TextDisplay.startDisplay(text_display, words, reading_speed);
    }

}
