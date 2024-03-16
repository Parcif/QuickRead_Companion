package com.example.main.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quickreadcompanion.R;

// Этот класс связывает данные с элементами пользовательского интерфейса
public class ReadingAdapter extends RecyclerView.Adapter<ReadingAdapter.ViewHolder>
{

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int view_type)
    {
        // создаем новый элемент списка
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        // Привязываем данные к элементу списка
        // holder.textView.setText(ваш_текст);
    }

    @Override
    public int getItemCount()
    {
        // Возвращаем количество элементов в списке
        return 0; // замените на реальное количество элементов
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        // Объявляем элементы пользовательского интерфейса, которые будут отображаться в каждом элементе списка
        // TextView text_view;
        public ViewHolder(View item_view)
        {
            super(item_view);
            // Инициализация элементов пользовательского интерфейса
            // textView = itemView.findViewById(R.id.text_view);
        }
    }

}