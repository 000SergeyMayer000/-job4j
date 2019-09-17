package ru.job4j.oop.Profession;

public class Programmer extends Engineer {
    private String nameProgram;

    public String getProgram() {
        return nameProgram;
    }

    public void setProgram(String program) {
       this.nameProgram = program;
    }

    public String ProgramName(Customers customer) {

        return getProgram();
    }
}
