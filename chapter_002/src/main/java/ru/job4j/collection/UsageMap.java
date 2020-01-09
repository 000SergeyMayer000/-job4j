package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("samajor@mail.ru", "Sergey Andreevich Mayer");
        map.put("parsentev@yandex.ru", "Petr Sergeevich Arsentev");
        for (String key : map.keySet()) {
            String name = map.get(key);
            System.out.println(key + " = " + name);
        }
    }
}
