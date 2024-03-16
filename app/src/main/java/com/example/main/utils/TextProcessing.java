package com.example.main.utils;
import java.util.ArrayList;
import java.util.Scanner;

public class TextProcessing
{
    public static ArrayList<String> processText(String text)
    {
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(text);
        // Указываем регулярное выражение для разделения на слова (не буквы и не цифры)
        scanner.useDelimiter("[^\\p{L}\\p{N}]+");
        while(scanner.hasNext())
        {
            String word = scanner.next();
            words.add(word);
        }
        scanner.close();
        return words;
    }

}