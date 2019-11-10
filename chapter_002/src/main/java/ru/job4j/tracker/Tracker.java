package ru.job4j.tracker;

import java.util.*;

/**
 * класс Tracker является хранилищем заявок и содержит методы и поля, необходимые для работы с заявками
 */

public class Tracker {
    public Item[] items = new Item[100];
    public int position = 0;
    private static final Random RN = new Random();

    /**
     * метод add добовляет заявку
     * @param item - заявка
     * @return - заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        this.items[position++] = item;
        return item;
    }

    /**
     * метод
     * @param id
     * @param item
     * @return
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int i = 0; i < position; i++) {
            if (items[i].getId().equals(id)) {
                this.items[i] = item;
                result = true;
                item.setId(id);
                break;
            }
        }
        return result;
    }

    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < position; i++) {
            Item item = items[i];
            if (item != null && item.getId().equals(id)) {
                System.arraycopy(items, i + 1, items, i, items.length - i - 1);
                result = true;
                position--;
                break;
            }
        }
        return result;
    }

    public Item[] findAll() {
        return Arrays.copyOf(this.items, this.position);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[this.position];
        int number = 0;
        for (int i = 0; i < position; i++) {
            Item item = items[i];
            if (item.getName().equals(key)) {
                result[number] = item;
                number++;
            }
        }
        return Arrays.copyOf(result, number);
    }

    public Item findById(String id) {
        Item result = null;
        for (int i = 0; i < position; i++) {
            Item item = items[i];
            if (item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    public String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }
}

