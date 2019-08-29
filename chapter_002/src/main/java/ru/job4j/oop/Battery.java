package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int size) {

        this.load = size;
    }

    public void exchenge(Battery another) {
        this.load = this.load + another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery powerBank = new Battery(90);
        Battery smartfone = new Battery(10);
        System.out.println("Сейчас смартфон заряжен на " + smartfone.load + "%, PowerBank заряжен на " + powerBank.load+"%");
        smartfone.exchenge(powerBank);
        System.out.println("Сейчас смартфон заряжен на " + smartfone.load + "%, PowerBank заряжен на " + powerBank.load +"%");
    }
}
