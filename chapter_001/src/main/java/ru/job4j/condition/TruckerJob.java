package ru.job4j.condition;

public class TruckerJob {
    public static void main(String[] args) {
        Driver steve = new Driver();
        System.out.println("Stevee wants the trucker job.");
        if (!steve.hasLicense()) {
            System.out.println("Steve need to get a license!");
            steve.passExamOn('A');
        }
        if (steve.canDrive('C')) {
            System.out.println("Steve works on truckers!");
        } else {
            if (steve.canDrive('B')) {
                System.out.println("Steve works in taxi.");
            } else {
                System.out.println("Steve dose not have a job. But you ride on the motorbike!");
            }
        }
    }

}