package com.example.java_code_learn.task2_lockaldate_serializer;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDateTime;

public class Example {
    //@JsonSerialize(using = MyDateSerializer.class)
    @JsonFormat(pattern = "yyyy:MM:dd##:HH:mm:ss:SSS")
    private LocalDateTime date;

    public Example() {
    }

    public Example(LocalDateTime date) {
        this.date = date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    //@JsonSerialize(using = MyDateSerializer.class)
    public LocalDateTime getDate() {
        return date;
    }
}
