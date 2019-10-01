package ru.job4j.oop.Profession;

public class Doctor extends Profession {
    private String certificate;

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String Diagnoseheal(Pacients pacient) {
        Pacients pacients = new Pacients();
        return pacients.getDiagnose();
    }

}
