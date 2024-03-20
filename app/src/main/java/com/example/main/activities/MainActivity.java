package com.example.main.activities;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.main.fragments.ReadingFragment;
import com.example.quickreadcompanion.R;

//основная активность приложения, которая запускается при его открытии.
// В этом классе обычно осуществляется инициализация пользовательского интерфейса
// и управление навигацией между различными экранами приложения
public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Дополнительные действия при создании активности

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new ReadingFragment())
                .commit();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        switch(id)
        {
            case 1000001:
                Toast.makeText(this, "Translate", Toast.LENGTH_SHORT).show();
                break;
            case 1000007:
                Toast.makeText(this, "Voiceover", Toast.LENGTH_SHORT).show();
                break;

        }
        return true;
    }
}