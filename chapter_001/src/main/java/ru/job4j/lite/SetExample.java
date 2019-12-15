package ru.job4j.lite;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(3);
        set.add(1);
        set.add(4);
        set.add(0);

        set.add(4); // дубликат не вставляетя

        for (Integer value : set) {
            System.out.println(value
            );

        }
        System.out.println(set.size());
    }
}

