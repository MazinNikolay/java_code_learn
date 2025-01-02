package com.example.java_code_learn.task10_stream_recursive_factorial;

import com.example.java_code_learn.task10_stream_recursive_factorial.task.FactorialTask;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinPoolExample {
    public static void main(String[] args) {
        int n = 10; // Вычисление факториала для числа 10

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        FactorialTask factorialTask = new FactorialTask(4);

        long result = forkJoinPool.invoke(factorialTask);

        System.out.println("Факториал " + 4 + "! = " + result);
    }
}