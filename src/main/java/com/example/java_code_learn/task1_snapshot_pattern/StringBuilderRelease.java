package com.example.java_code_learn.task1_snapshot_pattern;

public class StringBuilderRelease {
    private StringBuilder stringBuilder;

    public StringBuilderRelease() {
        stringBuilder = new StringBuilder();
    }

    public StringBuilderRelease(int capacity) {
        stringBuilder = new StringBuilder(capacity);
    }

    public void append(String string) {
        stringBuilder.append(string);
    }

    public void delete(int begin, int end) {
        stringBuilder.delete(begin, end);
    }

    public String toString() {
        return stringBuilder.toString();
    }

    public Memento save() {
        return new Memento(stringBuilder.toString());
    }

    public void restore(Memento memento) {
        stringBuilder = new StringBuilder(memento.getState());
    }
}