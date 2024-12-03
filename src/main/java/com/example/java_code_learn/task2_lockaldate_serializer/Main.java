package com.example.java_code_learn.task2_lockaldate_serializer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Example example = new Example();

        example.setDate(LocalDateTime.now());

        //С паттерном работает, если убрать ##
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy:MM:dd##:HH:mm:ss:SSS");
        System.out.println(example.getDate().format(formatter));

        //Тут отображается в формате по умолчанию
        System.out.println(example.getDate());
    }
}
