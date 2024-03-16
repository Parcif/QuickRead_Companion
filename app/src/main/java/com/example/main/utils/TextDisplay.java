package com.example.main.utils;

import android.widget.TextView;
import android.os.Handler;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class TextDisplay
{
    public static void startDisplay(TextView text_view, ArrayList<String> words, double speed)
    {
        // расчет задержки в формате слово/секунда
        speed = 60.0 / speed;
        long delay = (long) (speed * 1000);

        Handler handler = new Handler();
        AtomicInteger index = new AtomicInteger(0);

        // запускаем Runnable с задержкой
        handler.postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                // проверка индекса
                if(index.get() < words.size())
                {
                    // устанавливаем слово в вывод текста
                    text_view.setText(words.get(index.getAndIncrement()));
                    // снова запускаем Runnable с задержкой
                    handler.postDelayed(this, delay);
                }
            }
        }, delay);

    }

}