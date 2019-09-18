package ru.job4j.poly;

public interface Transport {
    public void drive();

    public void passenger(int count);

    public double costOfFuel(int amountOfFuel);

}
