package ru.job4j.collection;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Ivan", 21),
                new User("Anton", 34),
                new User("Petr", 35),
                new User("Mihail", 29)
        );
        Collections.sort(users, new SortByAgeAscending());
        System.out.println(users); // сортировка Age по ВОЗРОСТАНИЮ
        Collections.sort(users, new SortByAgeDescending());
        System.out.println(users); // сортировка Age по УБЫВАНИЮ
        Collections.sort(users, new SortByAgeAscending());
        System.out.println(users); // сортировка Age по ВОЗРОСТАНИЮ
        Collections.sort(users, new SortByNameAscendingSort());
        System.out.println(users); // сортировка Name по ВОЗРОСТАНИЮ
        Collections.sort(users, new SortByNameDescending());
        System.out.println(users); // сортировка Name по УБЫВАНИЮ
    }
}
