package com.example.main.models;

// Этот класс содержит свойства и методы для работы с данными пользователя
public class UserModel
{
    private String username;
    private String email;

    // Конструктор, геттеры и сеттеры
    public UserModel()
    {
        this.username = "";
        this.email = "";
    }

    public String getUsername()
    {
        return this.username;
    }

    public String getEmail()
    {
        return this.email;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
}