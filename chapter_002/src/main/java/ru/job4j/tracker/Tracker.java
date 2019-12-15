package ru.job4j.tracker;

import java.util.*;

/**
 * класс Tracker является хранилищем заявок и содержит методы и поля, необходимые для работы с заявками
 */

public class Tracker {
    private Item[] items = new Item[100];
    public int position = 0;

    /**
     * метод add добовляет заявку
     *
     * @param item - заявка
     * @return - заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position] = item;
        return item;
    }

    /**
     * метод обеспечивает вывод всех заявок
     * @return
     */

    public Item[] findAll() {
        Item[] result = new Item[position];
        int sizeCopyArray = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                result[i] = items[i];
                sizeCopyArray++;
            }
        }
        return Arrays.copyOf(result, sizeCopyArray);
    }

    /**
     * поиск заявок по имени
     * @param key - ключ поиска
     * @return - возвращает массив найденых заявок
     */

    public Item[] findByName(String key) {
        Item[] result = new Item[position];
        int sizeCopyArray = 0;
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            if (item.getName().equals(key)) {
                result[i] = item;
                sizeCopyArray++;
            }
        }
        return Arrays.copyOf(result, sizeCopyArray);
    }

    /**
     поиск заявок по имени
     * @param id - ID искомой заявки
     * @return - возвращает массив найденых заявок
     */

    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    /**
     * метод генерирует ID
     * @return
     */

    public String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
}