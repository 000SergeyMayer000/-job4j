package ru.job4j.tracker;

public class Profession {
    String name;
    int level;
    int experience;
    double salary;


    public static void main(String[] args) {
       Profession painter=new Profession();
       painter.name="Ivan";
       painter.level=5;
       painter.experience=12;
       painter.salary=25000.0;

       Profession doctor=new Profession();
        doctor.name="Anna";
        doctor.level=5;
        doctor.experience=15;
        doctor.salary=50000.0;

        }
    }



