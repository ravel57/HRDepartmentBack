package ru.ravel.HRDepartamentBack.Models;

public class Salary {

    private double salary;
    private long idEmployee;

    public Salary() {
    }

    public Salary(double salary, long idEmployee) {
        this.salary = salary;
        this.idEmployee = idEmployee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(long idEmployee) {
        this.idEmployee = idEmployee;
    }
}
