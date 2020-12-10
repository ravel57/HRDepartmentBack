package ru.ravel.HRDepartamentBack.Mappers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.jdbc.core.RowMapper;
import ru.ravel.HRDepartamentBack.Models.Vacancy;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class VacancyMapper implements RowMapper<Vacancy> {

    @Override
    public Vacancy mapRow(ResultSet rs, int rowNum) throws SQLException {
        Vacancy vacancy = new Vacancy();
        vacancy.setId(rs.getLong("id"));
        vacancy.setCity(rs.getString("city"));
        vacancy.setCategory(rs.getString("category"));
        vacancy.setJobType(rs.getString("job_type"));
        vacancy.setRole(rs.getString("role"));
        vacancy.setRequirement(rs.getString("requirements"));
        vacancy.setOpeningDate(new SimpleDateFormat("dd MMM yyyy").format(rs.getDate("opening_date")));
        vacancy.setStateId(rs.getLong("state"));
        vacancy.setProjectId(rs.getLong("project_id"));
        vacancy.setSalary(rs.getLong("salary"));
        return vacancy;
    }

    public static Vacancy mapJSON(String vacancyJSON){
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        return gson.fromJson(vacancyJSON, Vacancy.class);
    }

}
