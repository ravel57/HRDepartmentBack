package ru.ravel.HRDepartamentBack.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class MainController {
    //@RequestMapping(value = "/**/{path:[^\\\\.]*}", method = RequestMethod.GET)
    //public String catchAllPath () {
//        return "main";
//    }

    @GetMapping(value = "/")
    public String main () {
        return "main";
    }
}

