package com.example.main.fragments;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.view.ViewGroup;
import android.widget.TextView;

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
    private Button read_button;
    private TextView text_display;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_reading, container, false);

        // находим текстовое поле и кнопку по идентификаторам
        text_field = view.findViewById(R.id.text_field);
        read_button = view.findViewById(R.id.read_button);

        // устанавливаем обработчик нажатия на кнопку
        read_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // получение текста из текстового поля
                String entered_text = text_field.getText().toString();
                // обработка текста
                ArrayList<String> words = TextProcessing.processText(entered_text);

                // Запускаем новую активность и передаем текст через Intent
                Intent intent = new Intent(requireContext(), TextDisplayActivity.class);
                intent.putExtra("words", words);
                startActivity(intent);

            }
        });

        return view;

    }

    // отображение окна с выводом слов
//    private void displayText(ArrayList<String> words)
//    {
//        View text_view = LayoutInflater.from(getContext()).inflate(R.layout.text_display, null);
//        // Находим текстовое поле в макете диалогового окна
//        text_display = text_view.findViewById(R.id.text_display);
//
//        // Выводим текст на экран
//        TextDisplay.startDisplay(text_display, words, 200);
//
//        // Создаем и показываем AlertDialog
//        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
//        builder.setView(text_view);
//
//        AlertDialog dialog = builder.create();
//        dialog.show();
//    }

}