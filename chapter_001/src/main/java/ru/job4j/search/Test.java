package ru.job4j.search;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {

        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.put(new Task("Mayer", 5));
        priorityQueue.put(new Task("Ivanov", 9));
        priorityQueue.put(new Task("Petrov", 1));
        priorityQueue.put(new Task("Pet", 7));
        priorityQueue.put(new Task("Perov", 11));
        priorityQueue.put(new Task("***", 0));
        for (int i = 0; i != 6; i++) {
            System.out.println(priorityQueue.tasks.get(i).getPriority() + priorityQueue.tasks.get(i).getDesc());

        }
    }
}

