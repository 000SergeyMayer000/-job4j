package msa.lesson15;

public class Wrapper0 {

    public static void main(String[] args) {

        Integer i = new Integer(432); //примитив помещен в класс обертки
        System.out.println(i + 10); //результат - 442
        String s = i.toString(); // преобразуем примитив в строку
        int b = 10;
        System.out.println(s + b + "sergej"); //происходит конкатинация трех значений
    }
}




