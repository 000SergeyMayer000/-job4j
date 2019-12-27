package ru.job4j.collection;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Ivan", 21),
                new User("Anton", 21),
                new User("Petr", 35),
                new User("Oleg", 29)
        );
        Collections.sort(users, new SortByAgeAscendingSort());
        System.out.println(users); // сортировка Age по ВОЗРОСТАНИЮ
        Collections.sort(users, new SortByAgeDescendingSort());
        System.out.println(users); // сортировка Age по УБЫВАНИЮ
        Collections.sort(users, new SortByAgeAscendingSort());
        System.out.println(users); // сортировка Age по ВОЗРОСТАНИЮ
        Collections.sort(users, new SortByNameAscendingSort());
        System.out.println(users); // сортировка Name по ВОЗРОСТАНИЮ
        Collections.sort(users, new SortByNameDescendingSort());
        System.out.println(users); // сортировка Name по УБЫВАНИЮ
        Collections.sort(users, new SortByAgeAscendingSort().thenComparing(new SortByNameDescendingSort())); // комбинированный компаратор
        System.out.println(users);
    }
}
