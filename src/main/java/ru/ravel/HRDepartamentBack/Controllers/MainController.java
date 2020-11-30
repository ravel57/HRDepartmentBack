package ru.ravel.HRDepartamentBack.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.ravel.HRDepartamentBack.Models.Employee;
import ru.ravel.HRDepartamentBack.Models.UserDTO;
import ru.ravel.HRDepartamentBack.Models.UserRoleEnum;
import ru.ravel.HRDepartamentBack.Models.Vacancy;
import ru.ravel.HRDepartamentBack.Service.Impls.VacancyServiceImpl;
import ru.ravel.HRDepartamentBack.Service.Interfaces.EmployeeServiceInterface;
import ru.ravel.HRDepartamentBack.Service.Interfaces.UserServiceInterface;
import ru.ravel.HRDepartamentBack.Service.Interfaces.VacancyServiceInterface;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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