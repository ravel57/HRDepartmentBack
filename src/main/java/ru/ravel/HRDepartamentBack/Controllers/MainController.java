package ru.ravel.HRDepartamentBack.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
//    @Autowired
//    EmployeeServiceInterface employee;

    @GetMapping(value = "/**/{path:[^\\\\.]*}")
    public String catchAllPath() {
        return "main";
    }

    @GetMapping(value = "/")
    public String main() {
        return "main";
    }

//    @GetMapping(value = "/api/v1/test/")
//    public ResponseEntity<Object> getGroupResult(@RequestParam("param") String param) {
//        List<Employee> employees = employee.getAllEmployee();
//        return ResponseEntity.status(HttpStatus.OK).body(employees);
//    }



}