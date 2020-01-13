package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        HashSet<Task> tasks = new HashSet<>();
        tasks.addAll(list);
        for (Task task : tasks) {
            numbers.add(task.getNumber());
        }
        return numbers;
    }
}
