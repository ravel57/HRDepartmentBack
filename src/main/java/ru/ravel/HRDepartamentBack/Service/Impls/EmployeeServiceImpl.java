package ru.ravel.HRDepartamentBack.Service.Impls;

import org.springframework.stereotype.Service;
import ru.ravel.HRDepartamentBack.DAO.Interfaces.EmployeeDAOInterface;
import ru.ravel.HRDepartamentBack.Models.Employee;
import ru.ravel.HRDepartamentBack.Service.Interfaces.EmployeeServiceInterface;

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
