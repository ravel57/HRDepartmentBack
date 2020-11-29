package ru.ravel.HRDepartamentBack.Models;

public class PotentialEmployee {
    private long idPotentialEmployee;
    private String name;
    private String city;
    private String letter;
    private long idVacancy;

    public PotentialEmployee() { }

    public PotentialEmployee(long idPotentialEmployee, String name, String city, String letter, long idVacancy) {
        this.idPotentialEmployee = idPotentialEmployee;
        this.name = name;
        this.city = city;
        this.letter = letter;
        this.idVacancy = idVacancy;
    }

    public long getIdPotentialEmployee() {
        return idPotentialEmployee;
    }
    public void setIdPotentialEmployee(long idPotentialEmployee) {
        this.idPotentialEmployee = idPotentialEmployee;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getLetter() {
        return letter;
    }
    public void setLetter(String letter) {
        this.letter = letter;
    }

    public long getIdVacancy() {
        return idVacancy;
    }
    public void setIdVacancy(long idVacancy) {
        this.idVacancy = idVacancy;
    }

}
