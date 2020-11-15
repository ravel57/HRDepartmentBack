package ru.ravel.HRDepartamentBack.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller

public class MainController {
    @RequestMapping(value = "/**/{path:[^\\\\.]*}", method = RequestMethod.GET)
    public String catchAllPath() {
        return "main";
    }

    @GetMapping(value = "/")
    public String main() {
        return "main";
    }

    @GetMapping(value = "/api/v1/test/")
    public ResponseEntity<Object> getGroupResult(@RequestParam("param") String param,
                                                 @RequestParam("param2") String param2) {
        return ResponseEntity.status(HttpStatus.OK).body(param+";"+param2);
    }

}

