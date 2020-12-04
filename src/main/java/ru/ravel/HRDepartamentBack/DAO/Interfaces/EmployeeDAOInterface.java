package ru.ravel.HRDepartamentBack.DAO.Interfaces;

import ru.ravel.HRDepartamentBack.Models.Employee;
import ru.ravel.HRDepartamentBack.Models.PotentialEmployee;
import ru.ravel.HRDepartamentBack.Models.Vacancy;

import java.util.List;

public interface EmployeeDAOInterface {
    List<Employee> getAllEmployee();

    void addEmployee(Vacancy vacancy, PotentialEmployee potentialEmployee);

    Employee editEmployee(Employee employee);

    void hideEmployeeById(String employeeId);
    void hideEmployeeById(Long employeeId);
}
