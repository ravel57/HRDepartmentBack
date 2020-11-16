package ru.ravel.HRDepartamentBack.Mappers;

import org.springframework.jdbc.core.RowMapper;
import ru.ravel.HRDepartamentBack.Models.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee employee = new Employee();
        employee.setIdEmloyee(rs.getLong("id_employee"));
        employee.setNameEmployee(rs.getString("name_employee"));
        employee.setCityEmployee(rs.getString("city_employee"));
        employee.setIdProject(rs.getLong("id_project"));
        employee.setRoleEmployee(rs.getString("role_employee"));
        employee.setDateOfEmployment(rs.getDate("employee_date"));
        return employee;
    }
}
