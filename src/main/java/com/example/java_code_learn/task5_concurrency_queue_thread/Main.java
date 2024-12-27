package com.example.java_code_learn.task5_concurrency_queue_thread;

public class Main {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new BlockingQueue<>(10);
        Thread threadFirst = new Thread(() -> {
            try {
                for (int i = 0; i < 25; i++) {
                    queue.enqueue(i);
                    System.out.println("ThreadFirst produce " + i);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread threadSecond = new Thread(() -> {
            try {
                for (int i = 0; i < 20; i++) {
                    System.out.println("ThreadSecond consume " + queue.dequeue());
                    Thread.sleep(400);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        threadFirst.start();
        threadSecond.start();
    }
}
