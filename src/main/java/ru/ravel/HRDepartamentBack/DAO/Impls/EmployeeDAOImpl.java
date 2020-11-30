package ru.ravel.HRDepartamentBack.DAO.Impls;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.ravel.HRDepartamentBack.DAO.Interfaces.EmployeeDAOInterface;
import ru.ravel.HRDepartamentBack.Mappers.EmployeeMapper;
import ru.ravel.HRDepartamentBack.Models.Employee;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAOInterface {

    private final  JdbcTemplate jdbcTemplate;

    public EmployeeDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return jdbcTemplate.query("select * from employee", new EmployeeMapper());
    }
}
