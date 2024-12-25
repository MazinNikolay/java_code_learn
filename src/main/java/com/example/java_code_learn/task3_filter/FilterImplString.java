package com.example.java_code_learn.task3_filter;

public class FilterImplString implements Filter {
    @Override
    public Object apply(Object o) {
        return (String) o + " o";
    }
}
