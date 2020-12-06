package ru.ravel.HRDepartamentBack.Models;

public class Vacancy {

    private long id;
    private String city;
    private String category;
    private String jobType;
    private String role;
    private String requirement;
    private String openingDate;
    private long stateId;
    private long projectId;
    private long salary;


    public Vacancy(long id, String city, String category, String jobType, String role, String requirement,
                   String openingDate, long stateId, long projectId, long salary) {
        this.id = id;
        this.city = city;
        this.category = category;
        this.jobType = jobType;
        this.role = role;
        this.requirement = requirement;
        this.openingDate = openingDate;
        this.stateId = stateId;
        this.projectId = projectId;
        this.salary = salary;
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

    public String getOpeningDate() {
        return openingDate;
    }
    public void setOpeningDate(String openingDate) {
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

    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }

}
