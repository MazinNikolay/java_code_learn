package com.example.java_code_learn.task3_filter;

public class FilterImplInteger implements Filter {
    @Override
    public Object apply(Object o) {
        return (Integer) o * 2;
    }
}
