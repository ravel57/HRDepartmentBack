package ru.ravel.HRDepartamentBack.Service.Interfaces;

import ru.ravel.HRDepartamentBack.Models.Employee;
import ru.ravel.HRDepartamentBack.Models.PotentialEmployee;
import ru.ravel.HRDepartamentBack.Models.Vacancy;

import java.util.List;

public interface EmployeeServiceInterface {
    List<Employee> getAllEmployee();

    void addEmployee(Vacancy vacancy, PotentialEmployee potentialEmployee);

    Employee editEmployee(Employee employee);

    void deleteEmployeeById(String employeeIds);
//    void deleteEmployeeById(Long employeeId);


}
