package com.example.java_code_learn.task4_array_to_map;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("111", "222", "111", "333", "333", "444", "333"));
        System.out.println(mapperArrayToMap(list));
    }

    private static Map<Object, Integer> mapperArrayToMap(List<?> list) {
        Map<Object, Integer> result = new HashMap<>();
        list.forEach(e -> {
            Integer count = Collections.frequency(list, e);
            result.put(e, count);
        });
        return result;
    }
}