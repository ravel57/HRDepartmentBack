package ru.ravel.HRDepartamentBack.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.ravel.HRDepartamentBack.Models.Employee;
import ru.ravel.HRDepartamentBack.Service.EmployeeServiceInterface;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController{
    @Autowired
    EmployeeServiceInterface employeeServiceInterface;

    @GetMapping(value = "/**/{path:[^\\\\.]*}")
    public String catchAllPath() {
        return "main";
    }

    @GetMapping(value = "/")
    public String main() {
        return "main";
    }

    @GetMapping(value = "/api/v1/test/")
    public ResponseEntity<Object> getGroupResult(@RequestParam("param") String param) {
        List<Employee> employees= employeeServiceInterface.getAllEmployee();
        return ResponseEntity.status(HttpStatus.OK).body(employees);
    }

}

