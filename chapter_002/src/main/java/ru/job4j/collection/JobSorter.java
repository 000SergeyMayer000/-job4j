package ru.job4j.collection;

import ru.job4j.poly.collection.Job;
import ru.job4j.poly.collection.SortByNameJob;
import ru.job4j.poly.collection.SortByPtiorityJob;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        System.out.println(jobs);
        Collections.sort(jobs, new SortByNameJob().thenComparing(new SortByPtiorityJob()));
        System.out.println(jobs);
    }
}

