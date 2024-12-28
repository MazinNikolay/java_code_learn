package com.example.java_code_learn.task7_concurrency_synchronize.tasks;

import lombok.RequiredArgsConstructor;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

@RequiredArgsConstructor
public class ComplexTask implements Runnable {
    private final int taskId;
    private final CyclicBarrier barrier;

    @Override
    public void run() {
        try {
            execute();
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }

    public void execute() {
        try {
            System.out.println("Task " + taskId + " is executing");
            Thread.sleep((long) (Math.random() * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}