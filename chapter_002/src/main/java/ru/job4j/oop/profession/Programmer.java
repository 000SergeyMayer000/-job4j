package ru.job4j.oop.profession;

public class Programmer extends Engineer {
    private String nameProgram;

    public String getProgram() {
        return nameProgram;
    }

    public void setProgram(String program) {
        this.nameProgram = program;
    }

    public String programName(Customers customer) {

        return getProgram();
    }
}
