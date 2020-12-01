package ru.ravel.HRDepartamentBack.Models;

import java.util.Date;

public class Vacancy {

    private long id;
    private String city;
    private String category;
    private String jobType;
    private String role;
    private String requirement;
    private Date openingDate;
    private long stateId;
    private long projectId;

    public Vacancy(long id, String city, String category, String jobType, String role, String requirement, Date openingDate, long stateId, long projectId) {
        this.id = id;
        this.city = city;
        this.category = category;
        this.jobType = jobType;
        this.role = role;
        this.requirement = requirement;
        this.openingDate = openingDate;
        this.stateId = stateId;
        this.projectId = projectId;
    }

    public Vacancy() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public long getStateId() {
        return stateId;
    }

    public void setStateId(long stateId) {
        this.stateId = stateId;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }
}
