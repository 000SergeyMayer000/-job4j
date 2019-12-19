package ru.job4j.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSort {
    public static void main(String[] args) {
        //        ****** вывод производится отсортированным по возрастанию
//        Set<Integer> numbers = new TreeSet<>();
//        numbers.add(5);
//        numbers.add(1);
//        numbers.add(2);
//        System.out.println(numbers);

//          ******вывод производится отсортированным по убыванию

//        Set<Integer> numbers = new TreeSet<>(Collections.reverseOrder()); // в конструктор коллекции нужно передать корпоратор Collections.reverseOrder()
//        numbers.add(5);
//        numbers.add(1);
//        numbers.add(2);
//        System.out.println(numbers);


        Set<User> people = new TreeSet<>();
        people.add(new User("Ivan", 25));
        people.add(new User("Anton", 32));
        people.add(new User("Ivan", 42));
        people.add(new User("Andrey", 19));
        people.add(new User("Ivan", 19));
        System.out.println(people);
    }
}
