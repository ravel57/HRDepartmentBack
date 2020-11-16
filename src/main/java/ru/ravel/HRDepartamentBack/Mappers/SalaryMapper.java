package ru.ravel.HRDepartamentBack.Mappers;

import org.springframework.jdbc.core.RowMapper;
import ru.ravel.HRDepartamentBack.Models.Salary;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SalaryMapper implements RowMapper<Salary> {

    @Override
    public Salary mapRow(ResultSet rs, int rowNum) throws SQLException {
        Salary salary = new Salary();
        salary.setSalary(rs.getDouble("salary"));
        salary.setIdEmployee(rs.getLong("id_employee"));
        return salary;
    }
}
