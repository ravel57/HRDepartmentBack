package ru.ravel.HRDepartamentBack.Mappers;

import org.springframework.jdbc.core.RowMapper;
import ru.ravel.HRDepartamentBack.Models.Project;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProjectMapper implements RowMapper<Project> {

    @Override
    public Project mapRow(ResultSet rs, int rowNum) throws SQLException {
        Project project= new Project();
        project.setIdProject(rs.getLong("id"));
        project.setName(rs.getString("name"));
        project.setBeginningDate(rs.getDate("beginning_date"));
        project.setBudget(rs.getDouble("budget"));
        project.setIdDirector(rs.getLong("id_director"));
        return project;
    }
}
