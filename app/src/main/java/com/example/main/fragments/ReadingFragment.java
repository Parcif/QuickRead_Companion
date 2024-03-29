package com.example.main.fragments;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import com.example.main.activities.TextDisplayActivity;
import com.example.main.utils.*;
import com.example.quickreadcompanion.R;
import java.util.ArrayList;

// фрагмент для отображения текста и функций чтения.
// В этом классе реализуется логика отображения текста и
// управления скоростью чтения.
public class ReadingFragment extends Fragment
{
    private EditText text_field;
    private EditText speed_field;
    private Button read_button;
    private DrawerLayout drawer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_reading, container, false);

        // находим поля и кнопку по идентификаторам
        text_field = view.findViewById(R.id.editText);
        speed_field = view.findViewById(R.id.numberField);
        read_button = view.findViewById(R.id.read_button);

        // Обработчик кнопки меню
        drawer = view.findViewById(R.id.drawer_layout);
        ImageButton menu_button = view.findViewById(R.id.btn_menu);
        menu_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (drawer.isDrawerOpen(GravityCompat.END))
                {
                    drawer.closeDrawer(GravityCompat.END);
                }
                else
                {
                    drawer.openDrawer(GravityCompat.END);
                }
            }

        });

        // обработчик нажатия на кнопку Читать
        read_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // получение текста из текстового поля
                String entered_text = text_field.getText().toString();
                // обработка текста
                ArrayList<String> words = TextProcessing.processText(entered_text);

                // получение скорости чтения из поля
                String speed_text = speed_field.getText().toString();
                int read_speed = 0;
                if(!speed_text.isEmpty())
                {
                    read_speed = Integer.parseInt(speed_text);
                } else
                {
                    // Обработка случая, когда поле скорости чтения пустое
                    // Например, можно показать Toast сообщение
                    Toast.makeText(getContext(), "Please enter a reading speed", Toast.LENGTH_SHORT).show();
                    return; // Выход из метода, если поле пустое
                }

                // Запускаем новую активность и передаем текст через Intent
                Intent intent = new Intent(requireContext(), TextDisplayActivity.class);
                intent.putExtra("words", words);
                intent.putExtra("read_speed", read_speed); // Передаем скорость чтения
                startActivity(intent);

            }
        });

        return view;

    }

}