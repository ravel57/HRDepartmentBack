package ru.ravel.HRDepartamentBack.Service.Impls;

import org.springframework.stereotype.Service;
import ru.ravel.HRDepartamentBack.DAO.Interfaces.ProjectDAOInterface;
import ru.ravel.HRDepartamentBack.Models.Project;
import ru.ravel.HRDepartamentBack.Service.Interfaces.ProjectServiceInterface;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectServiceInterface {
    private final ProjectDAOInterface projectsDAO;
    public ProjectServiceImpl(ProjectDAOInterface userDAO) {
        this.projectsDAO = userDAO;
    }

    public List<Project> getAllProjects() {
        return projectsDAO.getAllProjects();
    }
}
