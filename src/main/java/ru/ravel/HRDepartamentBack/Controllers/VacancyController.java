package ru.ravel.HRDepartamentBack.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.ravel.HRDepartamentBack.Models.Vacancy;
import ru.ravel.HRDepartamentBack.Service.Interfaces.VacancyServiceInterface;

import java.util.List;

@RestController
public class VacancyController {
    @Autowired
    VacancyServiceInterface vacancies;


    @GetMapping("/api/v1/vacancy")
    public ResponseEntity<Object> getActualVacancy() {
        return ResponseEntity.status(HttpStatus.OK).body(vacancies.getActualVacancy());
    }

    @PostMapping(value = "/api/v1/vacancy")
    public ResponseEntity<Object> applyForVacancy(@RequestParam("idVacation") long idVacation,
                                                  @RequestParam("phoneNumber") String phoneNumber) {
        return ResponseEntity.status(HttpStatus.OK).body(vacancies.addPhoneNumberOnVacancy(idVacation, phoneNumber));
    }

    @PostMapping(value = "/api/v1/vacancy/add")
    public ResponseEntity<Object> addVacancy (@RequestParam(value = "vacancy") Vacancy vacancy) {
        return ResponseEntity.status(HttpStatus.OK).body(vacancies.addVacancy(vacancy));
    }


    @DeleteMapping(value = "/api/v1/vacancy")
    public ResponseEntity hideVacancyById(@RequestParam("idVacancy") long idVacancy) {
        vacancies.hideVacancyById(idVacancy);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }

    @PatchMapping(value = "/api/v1/vacancy")
    public ResponseEntity<Object> updateVacancy(@RequestParam("idVacancy") long idVacancy,
                                                @RequestParam("text") String text) {
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
}
