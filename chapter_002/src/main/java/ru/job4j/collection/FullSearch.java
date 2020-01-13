package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        int unique = list.size();
        for (int out = 0; out < unique; out++) {
            for (int in = out + 1; in < unique; in++) {
                if (list.get(out).equals(list.get(in))) {
                    list.set(out, list.get(unique - 1));
                    unique--;
                }
            }
        }
        for (Task task : list) {
            numbers.add(task.getNumber());
        }
        return numbers;
    }
}
