package com.example.java_code_learn.task2_lockaldate_serializer;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class Example {
    @JsonFormat(shape = JsonFormat.Shape.STRING,
            pattern = "yyyy:MM:dd :HH:mm:ss:SSS",
            locale = "ru")
    private LocalDateTime date;

    public Example(LocalDateTime date) {
        this.date = date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
