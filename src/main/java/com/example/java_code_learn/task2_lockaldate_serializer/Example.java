package com.example.java_code_learn.task2_lockaldate_serializer;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDateTime;

public class Example {
    //С сериалайзером не работает
    //@JsonSerialize(using = MyDateSerializer.class)

    //С этой аннотацией так же не работает
    @JsonFormat(pattern = "yyyy:MM:dd##:HH:mm:ss:SSS")
    private LocalDateTime date;

    public Example() {
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    //Пробовал на геттер повешать аннотации, тоже не получилось
    //@JsonSerialize(using = MyDateSerializer.class)
    public LocalDateTime getDate() {
        return date;
    }
}
