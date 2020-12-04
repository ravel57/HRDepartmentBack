package ru.ravel.HRDepartamentBack.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


//страница для бухгалтера
//страница для руководителя (получать всех, изменять проект)
//страница для hr (получать всех, изменять, удалять)

//todo отдельный контейнер центральной части
//todo по-умолчанию закрытые карточки
//todo описание в заголовке карточки
//todo цвета кнопок
//todo кнопка входа на ПК
//todo пофиксить даты
//todo не опускать вниз после редактирования (мб помечать как-нибудь)
//todo не отображается имя в обозревателе откликнувшехся

//todo сервис переноса на сервер
//todo id на связующие таблицы в БД
//todo docker


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