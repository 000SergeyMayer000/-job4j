package ru.job4j.pojo;

public class Student {
    String name;
    String group;
    String dateOfAdmission;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(String dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Mayer Sergey A.");
        student1.setGroup("JOB4J19-1");
        student1.setDateOfAdmission("march 2019");
        System.out.println(student1.getName() + " study in group " + student1.getGroup() + " since " + student1.getDateOfAdmission());
    }
}
