package com.example.main.models;

// Этот класс содержит свойства и методы для работы с текстовой информацией
public class TextModel
{
    private String title;
    private String content;

    // Конструктор, геттеры и сеттеры
    public TextModel()
    {
        this.title = "";
        this.content = "";
    }

    public String getTitle()
    {
        return this.title;
    }

    public String getContent()
    {
        return this.content;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setContent(String content)
    {
        this.content = content;
    }
}