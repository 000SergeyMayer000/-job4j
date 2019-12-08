package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {

    public LinkedList<Task> tasks = new LinkedList<>();
    int size = 0;

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставик использовать add(int index, E value)
     *
     * @param task задача
     */

    public void put(Task task) {
        int counter = 0;
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getPriority() > task.getPriority()) {
                counter = i+1;
            }
        }
        tasks.add(counter, task);
    }

    /**
     * метод возвращает первый элемент в списке
     *
     * @return
     */

    public Task take() {
        return this.tasks.poll();
    }
}



