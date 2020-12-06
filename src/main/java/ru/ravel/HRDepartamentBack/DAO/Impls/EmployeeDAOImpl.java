package ru.ravel.HRDepartamentBack.DAO.Impls;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.ravel.HRDepartamentBack.DAO.Interfaces.EmployeeDAOInterface;
import ru.ravel.HRDepartamentBack.Mappers.EmployeeMapper;
import ru.ravel.HRDepartamentBack.Mappers.VacancyMapper;
import ru.ravel.HRDepartamentBack.Models.Employee;
import ru.ravel.HRDepartamentBack.Models.PotentialEmployee;
import ru.ravel.HRDepartamentBack.Models.Vacancy;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAOInterface {

    private final JdbcTemplate jdbcTemplate;

    public EmployeeDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return jdbcTemplate.query("select * from employees", new EmployeeMapper());
    }

    @Override
    public void addEmployee(Vacancy vacancy, PotentialEmployee potentialEmployee) {
        jdbcTemplate.update(
                "INSERT INTO employees (name, id_project, role, date, city, salary, phone_number) " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?);",
                potentialEmployee.getName(), vacancy.getProjectId(), vacancy.getRole(), LocalDateTime.now(),
                potentialEmployee.getCity(), vacancy.getSalary(), potentialEmployee.getPhoneNumber()
        );
        jdbcTemplate.update(
                "delete from potential_employees where id = ?",
                potentialEmployee.getId()
        );
        return;
    }

    @Override
    public Employee editEmployee(Employee employee) {
        try {
            jdbcTemplate.update(
                    "UPDATE employees " +
                            "SET id_project = ?, role = ?, date = ?, city = ?, name = ?, salary = ? " +
                            "WHERE id = ?;",
                    employee.getIdProject(), employee.getRole(), employee.getDateOfEmployment(), employee.getCity(),
                    employee.getName(), employee.getSalary(), employee.getId()
            );
            return jdbcTemplate.queryForObject(
                    "select * from employees where id = ?;",
                    new Object[]{employee.getId()},
                    new EmployeeMapper()
            );
        } catch (DataAccessException e) {
            return null;
        }
    }

    @Override
    public void hideEmployeeById(String employeeIds) {
        jdbcTemplate.update("delete from employees where id in (" + employeeIds + ");");
    }

//    @Override
//    public void hideEmployeeById(Long employeeId) {
//        jdbcTemplate.update("DELETE FROM employees WHERE id = ?;", employeeId);
//    }
}
