package com.example.java_code_learn.task9_stream_parallel_stream_students;

import com.example.java_code_learn.task9_stream_parallel_stream_students.entity.Student;
import com.example.java_code_learn.task9_stream_parallel_stream_students.mapper.StudentsMapper;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ParallelStreamCollectMapAdvancedExample {
    public static void main(String[] args) {
        StudentsMapper mapper = new StudentsMapper();
        List<Student> students = Arrays.asList(
                new Student("Student1", Map.of("Math", 90, "Physics", 85)),
                new Student("Student2", Map.of("Math", 95, "Physics", 88)),
                new Student("Student3", Map.of("Math", 88, "Chemistry", 92)),
                new Student("Student4", Map.of("Physics", 78, "Chemistry", 85))
        );
        mapper.mappingStudents(students).forEach((item, sumGrade) ->
                System.out.println(item + " " + sumGrade));
    }
}