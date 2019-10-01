package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void givNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println(this.name + " eat " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.givNick("Gav");
        gav.show();
        Cat black = new Cat();
        black.eat("fish");
        black.givNick("Black");
        black.show();
    }
}
