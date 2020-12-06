package ru.ravel.HRDepartamentBack.Mappers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.jdbc.core.RowMapper;
import ru.ravel.HRDepartamentBack.Models.PotentialEmployee;
import ru.ravel.HRDepartamentBack.Models.Vacancy;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PotentialEmployeeMapper implements RowMapper<PotentialEmployee> {

    @Override
    public PotentialEmployee mapRow(ResultSet rs, int rowNum) throws SQLException {
        PotentialEmployee potentialEmployee = new PotentialEmployee();
        potentialEmployee.setId(rs.getLong("id"));
//        potentialEmployee.setVacancyId(rs.getLong("vacancy_id"));
        potentialEmployee.setName(rs.getString("name"));
        potentialEmployee.setPhoneNumber(rs.getString("phone_number"));
        potentialEmployee.setCity(rs.getString("city"));
        potentialEmployee.setLetter(rs.getString("letter"));
        return potentialEmployee;
    }

    public static PotentialEmployee mapJSON(String vacancyJSON){
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        return gson.fromJson(vacancyJSON, PotentialEmployee.class);
    }
}
