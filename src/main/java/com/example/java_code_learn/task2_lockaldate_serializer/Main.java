package com.example.java_code_learn.task2_lockaldate_serializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws Exception {
        /*Example example = new Example();
        example.setDate(LocalDateTime.now());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy:MM:dd :HH:mm:ss:SSS");
        System.out.println(example.getDate().format(formatter));*/
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        Example example = new Example(LocalDateTime.now());
        String jsonString = mapper.writeValueAsString(example);
        System.out.println(jsonString);
    }
}
