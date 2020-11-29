package ru.ravel.HRDepartamentBack.Service;

import org.springframework.stereotype.Service;
import ru.ravel.HRDepartamentBack.DAO.EmployeeDAOInterface;
import ru.ravel.HRDepartamentBack.Models.Employee;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeServiceInterface {

    private final EmployeeDAOInterface employeeDAOInterface;

    public EmployeeServiceImpl(EmployeeDAOInterface employeeDAOInterface) {
        this.employeeDAOInterface = employeeDAOInterface;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeDAOInterface.getAllEmployee();
    }

}
