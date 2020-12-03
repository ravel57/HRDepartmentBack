package ru.ravel.HRDepartamentBack.Models;

public class PotentialEmployee {
//    private long vacancyId;
    private String name;
    private String phoneNumber;
    private String city;
    private String letter;

    public PotentialEmployee() {
    }

    public PotentialEmployee(String name, String phoneNumber, String city, String letter) {
//        this.vacancyId = vacancyId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.letter = letter;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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


}
