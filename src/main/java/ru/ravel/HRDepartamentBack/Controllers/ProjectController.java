package ru.ravel.HRDepartamentBack.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ravel.HRDepartamentBack.Service.Interfaces.ProjectServiceInterface;

@RestController
public class ProjectController {
    final ProjectServiceInterface projects;
    public ProjectController(ProjectServiceInterface projects) {
        this.projects = projects;
    }

    @GetMapping(value = "/api/v1/projects")
    public ResponseEntity<Object> getAllProjects() {
        return ResponseEntity.status(HttpStatus.OK).body(projects.getAllProjects());
    }
}
