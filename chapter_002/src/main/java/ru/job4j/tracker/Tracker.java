package ru.job4j.tracker;

import java.util.*;

/**
 * класс Tracker является хранилищем заявок и содержит методы и поля, необходимые для работы с заявками
 */

public class Tracker {
    public List <Item> items = new ArrayList<>();
    public int position = 0;
    private static final Random RN = new Random();

    /**
     * метод add добовляет заявку
     * @param item - заявка
     * @return - заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        this.items.add(position++, item);
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
            //  if (items[i].getId().equals(id)) {
            if (items.get(i).getId().equals(id)) {
                this.items.add(i, item);
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
            Item item = items.get(i);

            if (item != null && item.getId().equals(id)) {
                items.remove(item);
//                System.arraycopy(items, i + 1, items, i, items.size() - i - 1);
                result = true;
                position--;
                break;
            }
        }
        return result;
    }

    public List<Item> findAll() {
        return items;
    }

    public List<Item> findByName(String key) {
        List <Item> result = new ArrayList<>();
        int number = 0;
        for (int i = 0; i < position; i++) {
            Item item = items.get(i);
            if (item.getName().equals(key)) {
                result.add(number, item);
                number++;
            }
        }
        return result;
    }

    public Item findById(String id) {
        Item result = null;
        for (Item item: items) {
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
