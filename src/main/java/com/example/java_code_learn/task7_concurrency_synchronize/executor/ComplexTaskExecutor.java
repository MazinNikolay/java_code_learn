package com.example.java_code_learn.task7_concurrency_synchronize.executor;

import com.example.java_code_learn.task7_concurrency_synchronize.tasks.ComplexTask;
import lombok.AllArgsConstructor;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@AllArgsConstructor
public class ComplexTaskExecutor {
    private int numberOfTasks;

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
