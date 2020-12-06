package ru.ravel.HRDepartamentBack.Models;


import java.util.Date;

public class Employee {

    private long id;
    private String name;
    private String city;
    private String projectName;
    private long projectId;
    private String role;
    private String dateOfEmployment;
    private long salary;
    private String phoneNumber;

    public Employee() {
    }

    public Employee(long id, String name, String city, String ProjectName, long ProjectId,
                    String role, String dateOfEmployment, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.projectName = ProjectName;
        this.projectId = ProjectId;
        this.role = role;
        this.dateOfEmployment = dateOfEmployment;
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
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

    public String getProjectName() {
        return projectName;
    }
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public long getProjectId() {
        return projectId;
    }
    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public String getDateOfEmployment() {
        return dateOfEmployment;
    }
    public void setDateOfEmployment(String dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
