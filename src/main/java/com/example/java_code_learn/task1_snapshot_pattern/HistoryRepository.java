package com.example.java_code_learn.task1_snapshot_pattern;

import java.util.ArrayList;
import java.util.List;

public class HistoryRepository {
    private List<Memento> mementos = new ArrayList<>();

    public void push(Memento memento) {
        mementos.add(memento);
    }

    public Memento pop() {
        return mementos.remove(mementos.size() - 1);
    }
}