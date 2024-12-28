package com.example.java_code_learn.task7_concurrency_synchronize.executor;

import com.example.java_code_learn.task7_concurrency_synchronize.tasks.ComplexTask;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ComplexTaskExecutor {
    public void executeTasks(int numberOfTasks) {
        CyclicBarrier barrier = new CyclicBarrier(numberOfTasks, () -> {
            System.out.println("All tasks have finished execution. Merging results....");
        });

        ExecutorService executorService = Executors.newFixedThreadPool(numberOfTasks);
        for (int i = 0; i < numberOfTasks; i++) {
            executorService.execute(new ComplexTask(i, barrier));
        }

        executorService.shutdown();
    }
}
