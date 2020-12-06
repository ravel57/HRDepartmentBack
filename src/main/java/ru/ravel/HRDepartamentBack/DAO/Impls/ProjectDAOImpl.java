package ru.ravel.HRDepartamentBack.DAO.Impls;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.ravel.HRDepartamentBack.DAO.Interfaces.ProjectDAOInterface;
import ru.ravel.HRDepartamentBack.Mappers.ProjectMapper;
import ru.ravel.HRDepartamentBack.Models.Project;

import java.util.List;

@Repository
public class ProjectDAOImpl implements ProjectDAOInterface {

    private final JdbcTemplate jdbcTemplate;
    public ProjectDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Project> getAllProjects() {
        return jdbcTemplate.query("select * from projects;", new ProjectMapper());
    }
}
