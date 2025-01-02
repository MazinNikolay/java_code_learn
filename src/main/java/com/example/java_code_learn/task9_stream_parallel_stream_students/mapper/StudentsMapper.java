package com.example.java_code_learn.task9_stream_parallel_stream_students.mapper;

import com.example.java_code_learn.task9_stream_parallel_stream_students.entity.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentsMapper {
    public Map<String, Double> mappingStudents(List<Student> students) {
        return students.parallelStream().flatMap(
                        s -> s.getGrades().entrySet().stream())
                .collect(Collectors.groupingBy(Map.Entry::getKey,
                        Collectors.averagingDouble(Map.Entry::getValue)));
    }
}
