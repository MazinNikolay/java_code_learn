package com.example.java_code_learn.task1_snapshot_pattern;

public class Main {
    public static void main(String[] args) {
        StringBuilderRelease stringBuilderRelease = new StringBuilderRelease();
        HistoryRepository history = new HistoryRepository();
        stringBuilderRelease.append("111");
        history.push(stringBuilderRelease.save());
        stringBuilderRelease.append("222");
        stringBuilderRelease.append("333");
        System.out.println(stringBuilderRelease);
        history.push(stringBuilderRelease.save());
        stringBuilderRelease.append("1234");
        System.out.println(stringBuilderRelease);
        stringBuilderRelease.restore(history.pop());
        System.out.println(stringBuilderRelease);
        stringBuilderRelease.restore(history.pop());
        System.out.println(stringBuilderRelease);
    }
}