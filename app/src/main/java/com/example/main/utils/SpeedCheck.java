package com.example.main.utils;
import android.widget.TextView;

public class SpeedCheck
{
    public static void check(TextView text_view, double speed)
    {
        int reading_speed = 0;

        try {
            reading_speed = Integer.parseInt(String.valueOf(speed));
        } catch (NumberFormatException ex) {
            System.out.println("Input is not an int value"); // желательно Sout поменять на вывод на экран приложения
        }

        if(reading_speed <= 0)
        {
            System.out.println("Number is negative"); // тут аналогично
        }
    }
}