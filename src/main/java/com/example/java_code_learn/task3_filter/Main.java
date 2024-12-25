package com.example.java_code_learn.task3_filter;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Filter filterString = new FilterImplString();
        Filter filterInteger = new FilterImplInteger();
        ArrayList<String> stringList = new ArrayList<>(List.of("qqq", "www", "eee"));
        ArrayList<Integer> integerList = new ArrayList<>(List.of(111, 222, 333));

        System.out.println(filter(stringList, filterString));
        System.out.println(filter(integerList, filterInteger));
    }

    public static List<?> filter(List<?> objects, Filter filter) {
        return objects.stream()
                .map(filter::apply)
                .toList();
    }
}