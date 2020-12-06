package ru.ravel.HRDepartamentBack.Mappers;

import com.google.gson.*;
import org.springframework.jdbc.core.RowMapper;
import ru.ravel.HRDepartamentBack.Models.Employee;

import java.lang.reflect.Type;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee employee = new Employee();
        employee.setId(rs.getLong("id"));
        employee.setName(rs.getString("name"));
        employee.setProjectName(rs.getString("project_name"));
        employee.setProjectId(rs.getLong("project_id"));
        employee.setRole(rs.getString("role"));
        employee.setDateOfEmployment(new SimpleDateFormat("dd MMM yyyy").format(rs.getDate("date")));
        employee.setCity(rs.getString("city"));
        employee.setSalary(rs.getLong("salary"));
        employee.setPhoneNumber(rs.getString("phone_number"));
        return employee;
    }

    public static Employee mapJSON(String employeeJSON) {
        final Gson gson = new GsonBuilder()
                .registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
                    public Date deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {
                        return new Date(jsonElement.getAsJsonPrimitive().getAsLong());
                    }
                })
                .create();
        return gson.fromJson(employeeJSON, Employee.class);
    }

//    public static List<Employee> mapJSONArray(String employeeJSON) {
//        GsonBuilder builder = new GsonBuilder();
//        Gson gson = builder.create();
//        return gson.fromJson(employeeJSON, Employee.class);
//    }
}
