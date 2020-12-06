package ru.ravel.HRDepartamentBack.Mappers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.jdbc.core.RowMapper;
import ru.ravel.HRDepartamentBack.Models.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeeMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee employee = new Employee();
        employee.setId(rs.getLong("id"));
        employee.setName(rs.getString("name"));
        employee.setIdProject(rs.getLong("id_project"));
        employee.setRole(rs.getString("role"));
        employee.setDateOfEmployment(rs.getDate("date"));
        employee.setCity(rs.getString("city"));
        employee.setSalary(rs.getLong("salary"));
        employee.setPhoneNumber(rs.getString("phone_number"));
        return employee;
    }

    public static Employee mapJSON(String employeeJSON) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        return gson.fromJson(employeeJSON, Employee.class);
    }

//    public static List<Employee> mapJSONArray(String employeeJSON) {
//        GsonBuilder builder = new GsonBuilder();
//        Gson gson = builder.create();
//        return gson.fromJson(employeeJSON, Employee.class);
//    }
}
