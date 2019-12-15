package ru.job4j.lite;

import java.util.HashMap;
import java.util.Map;

import static java.lang.String.format;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("sergej mayer", 3);
        students.put("petr arsentev", 5);

        //  System.out.println(students.get("sergej mayer"));

        for (String studentName : students.keySet()) {
            System.out.println(format("%s : %s", studentName, students.get(studentName)));
        }
    }

}
