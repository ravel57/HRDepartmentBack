package ru.ravel.HRDepartamentBack.Models;


import java.util.Date;

public class Employee {

    private long id;
    private String name;
    private String city;
    private long idProject;
    private String role;
    private Date dateOfEmployment;
    private long salary;
    private String phoneNumber;

    public Employee() {
    }

    public Employee(long id, String name, String city, long idProject,
                    String role, Date dateOfEmployment, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.idProject = idProject;
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

    public long getIdProject() {
        return idProject;
    }
    public void setIdProject(long idProject) {
        this.idProject = idProject;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public Date getDateOfEmployment() {
        return dateOfEmployment;
    }
    public void setDateOfEmployment(Date dateOfEmployment) {
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
