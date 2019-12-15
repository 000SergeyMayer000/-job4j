package ru.job4j.poly.collection;

import java.util.Comparator;

class SortByNameJob implements Comparator<Job> {

    @Override
    public int compare(Job first, Job second) {
        return first.getName().compareTo(second.getName());
    }
}
