package com.example.java_code_learn.task9_stream_parallel_stream_students.entity;

import lombok.Data;

import java.util.Map;

@Data
public class Student {
    private String name;
    private Map<String, Integer> grades;

    public Student(String name, Map<String, Integer> grades) {
        this.name = name;
        this.grades = grades;
    }
}
