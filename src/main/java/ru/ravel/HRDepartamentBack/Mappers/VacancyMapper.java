package ru.ravel.HRDepartamentBack.Mappers;

import org.springframework.jdbc.core.RowMapper;
import ru.ravel.HRDepartamentBack.Models.Vacancy;

import java.sql.ResultSet;
import java.sql.SQLException;

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
        vacancy.setOpeningDate(rs.getDate("opening_date"));
        vacancy.setStateId(rs.getLong("state_id"));
        vacancy.setProjectId(rs.getLong("project_id"));
        return vacancy;
    }
}
