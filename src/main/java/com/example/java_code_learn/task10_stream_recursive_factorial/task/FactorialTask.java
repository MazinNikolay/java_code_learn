package com.example.java_code_learn.task10_stream_recursive_factorial.task;

import lombok.RequiredArgsConstructor;

import java.util.concurrent.RecursiveTask;

@RequiredArgsConstructor
public class FactorialTask extends RecursiveTask<Long> {
    private final int number;

    @Override
    public Long compute() {
        if (number <= 1) {
            return 1L;
        } else {
            FactorialTask task = new FactorialTask(number - 1);
            task.fork();
            return number * task.join();
        }
    }
}