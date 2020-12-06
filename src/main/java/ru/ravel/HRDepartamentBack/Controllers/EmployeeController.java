package ru.ravel.HRDepartamentBack.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.ravel.HRDepartamentBack.Mappers.EmployeeMapper;
import ru.ravel.HRDepartamentBack.Service.Interfaces.EmployeeServiceInterface;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeServiceInterface employees;

    @GetMapping(value = "/api/v1/employee")
    public ResponseEntity<Object> getAllEmployee() {
        return ResponseEntity.status(HttpStatus.OK).body(employees.getAllEmployee());
    }

    @GetMapping(value = "/api/v1/employeeReport")
    public ResponseEntity<Object> employeeReport() {
        return ResponseEntity.status(HttpStatus.OK).body("чучашка");
    }

    @PostMapping(value = "/api/v1/employee/edit")
    public ResponseEntity<Object> updateVacancy(@RequestParam("employee") String employeeJSON) {
        return ResponseEntity.status(HttpStatus.OK).body(employees.editEmployee(EmployeeMapper.mapJSON(employeeJSON)));
    }

//    @DeleteMapping(value = "/api/v1/employee/{employeeId}")
//    public ResponseEntity hideVacancyById(@PathVariable long employee) {
////    public ResponseEntity hideVacancyById(@PathVariable Long employeeId) {
//         //EmployeeMapper.mapJSON(employee);
//        employees.hideEmployeeById(employee);
//        return ResponseEntity.status(HttpStatus.OK).body(null);
//    }


    @DeleteMapping(value = "/api/v1/employee/{employeeId}")
    public ResponseEntity hideVacancyById(@PathVariable("employeeId") String employeeIds) {
        employees.deleteEmployeeById(employeeIds);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
}
