package ru.job4j.oop;

public class College {

    Student student = new Freshman(); //upcasting - восходящее преобразование( преобрахование
                                     // происходит автоматически, не явно
    Object object = new Freshman();  //upcasting

    Freshman freshman1 = (Freshman) student; //down casting - низходящее преобразование (необходимо
    // явно перобразовывать.

}
