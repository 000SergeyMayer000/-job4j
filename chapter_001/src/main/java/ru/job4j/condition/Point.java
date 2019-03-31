package ru.job4j.condition;

import java.math.MathContext;

public class Point {
    public double distance(int x1, int y1, int x2, int y2) {

        return Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
    }

    public static void main(String[] args) {
        Point rast = new Point();
        double man = rast.distance(0, 0, 0, 10);
        System.out.println(man);
    }
}