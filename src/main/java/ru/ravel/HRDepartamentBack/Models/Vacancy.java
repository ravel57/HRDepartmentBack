package ru.ravel.HRDepartamentBack.Models;

import java.util.Date;

public class Vacancy {

    private long idVacancy;
    private String city;
    private String category;
    private String jobType;
    private String role;
    private String requirement;
    private Date openingDate;
    private String state;
    private long idProject;

    public Vacancy(long idVacancy, String city, String category, String jobType, String role, String requirement, Date openingDate, String state, long idProject) {
        this.idVacancy = idVacancy;
        this.city = city;
        this.category = category;
        this.jobType = jobType;
        this.role = role;
        this.requirement = requirement;
        this.openingDate = openingDate;
        this.state = state;
        this.idProject = idProject;
    }

    public Vacancy() {
    }

    public long getIdVacancy() {
        return idVacancy;
    }

    public void setIdVacancy(long idVacancy) {
        this.idVacancy = idVacancy;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getIdProject() {
        return idProject;
    }

    public void setIdProject(long idProject) {
        this.idProject = idProject;
    }
}
