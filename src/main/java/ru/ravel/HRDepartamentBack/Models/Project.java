package ru.ravel.HRDepartamentBack.Models;

import java.util.Date;

public class Project {
    private long idProject;
    private String name;
    private Date beginningDate;
    private double budget;
    private long idDirector;

    public Project() {  }

    public Project(long idProject, String name, Date beginningDate, double budget, long idDirector) {
        this.idProject = idProject;
        this.name = name;
        this.beginningDate = beginningDate;
        this.budget = budget;
        this.idDirector = idDirector;
    }

    public long getIdProject() {
        return idProject;
    }
    public void setIdProject(long idProject) {
        this.idProject = idProject;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Date getBeginningDate() {
        return beginningDate;
    }
    public void setBeginningDate(Date beginningDate) {
        this.beginningDate = beginningDate;
    }

    public double getBudget() {
        return budget;
    }
    public void setBudget(double budget) {
        this.budget = budget;
    }

    public long getIdDirector() {
        return idDirector;
    }
    public void setIdDirector(long idDirector) {
        this.idDirector = idDirector;
    }

}
