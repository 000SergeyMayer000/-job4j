package ru.job4j.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserConvert {
    List<User> list = new ArrayList<>();

    public void add(User person) {
        this.list.add(person);
    }

    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> map = new HashMap<>();
        for (User user : list) {
            map.put(user.getId(), user);
        }
        return map;
    }
}
