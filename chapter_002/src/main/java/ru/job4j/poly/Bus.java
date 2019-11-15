package ru.job4j.poly;

public class Bus implements Transport {
    private String name = "Икарус";
    private double price = 45.5;

    @Override
    public void drive() {
        double t = 5.5;
        double v = 90;
        double s = t * v;
        System.out.println("Пройденый путь составил - " + s + " км");
    }

    @Override
    public void passenger(int count) {
        System.out.println("В транспортном средстве - " + name + " " + count + " - посадочных мест");
    }

    @Override
    public double costOfFuel(int amountOfFuel) {
        double sum = price * amountOfFuel;
        System.out.println("Стоимость топлива составила - " + sum + " руб.");
        return sum;
    }
}
