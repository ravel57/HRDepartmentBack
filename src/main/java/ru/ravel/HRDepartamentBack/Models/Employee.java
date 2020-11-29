package ru.ravel.HRDepartamentBack.Models;


import java.util.Date;

public class Employee {

    private long idEmloyee;
    private String nameEmployee;
    private String cityEmployee;
    private long idProject;
    private String roleEmployee;
    private Date dateOfEmployment;

    public Employee() {
    }

    public Employee(long idEmloyee, String nameEmployee, String cityEmployee, long idProject, String roleEmployee, Date dateOfEmployment) {
        this.idEmloyee = idEmloyee;
        this.nameEmployee = nameEmployee;
        this.cityEmployee = cityEmployee;
        this.idProject = idProject;
        this.roleEmployee = roleEmployee;
        this.dateOfEmployment = dateOfEmployment;
    }

    public long getIdEmloyee() {
        return idEmloyee;
    }
    public void setIdEmloyee(long idEmloyee) {
        this.idEmloyee = idEmloyee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }
    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getCityEmployee() {
        return cityEmployee;
    }
    public void setCityEmployee(String cityEmployee) {
        this.cityEmployee = cityEmployee;
    }

    public long getIdProject() {
        return idProject;
    }
    public void setIdProject(long idProject) {
        this.idProject = idProject;
    }

    public String getRoleEmployee() {
        return roleEmployee;
    }
    public void setRoleEmployee(String roleEmployee) {
        this.roleEmployee = roleEmployee;
    }

    public Date getDateOfEmployment() {
        return dateOfEmployment;
    }
    public void setDateOfEmployment(Date dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }


}
