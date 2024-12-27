package com.example.java_code_learn.task5_concurrency_queue_thread;

import java.util.PriorityQueue;
import java.util.Queue;

public class BlockingQueue<T> {
    private final Queue<T> queue;
    private final int maxSize;

    public BlockingQueue(int maxSize) {
        this.queue = new PriorityQueue<>(maxSize);
        this.maxSize = maxSize;
    }

    public synchronized void enqueue(T item) throws InterruptedException{
        while (queue.size() == maxSize) {
            wait();
        }
        queue.add(item);
        notifyAll();
    }

    public synchronized T dequeue() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        T item = queue.poll();
        notifyAll();
        return item;
    }

    public synchronized int size() {
        return queue.size();
    }
}