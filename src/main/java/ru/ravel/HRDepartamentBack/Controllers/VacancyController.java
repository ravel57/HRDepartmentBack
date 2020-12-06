package ru.ravel.HRDepartamentBack.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.ravel.HRDepartamentBack.Mappers.PotentialEmployeeMapper;
import ru.ravel.HRDepartamentBack.Mappers.VacancyMapper;
import ru.ravel.HRDepartamentBack.Service.Interfaces.VacancyServiceInterface;


@RestController
public class VacancyController {
    @Autowired
    VacancyServiceInterface vacancies;


    @GetMapping("/api/v1/vacancy")
    public ResponseEntity<Object> getActualVacancy() {
        return ResponseEntity.status(HttpStatus.OK).body(vacancies.getActualVacancy());
    }

    @GetMapping("/api/v1/vacancy/potentialEmployee/")
    public ResponseEntity<Object> getRespondedOnVacancy(@RequestParam("vacancyId") long vacancyId) {
        return ResponseEntity.status(HttpStatus.OK).body(vacancies.getApplicantsForVacancies(vacancyId));
    }

    @PostMapping(value = "/api/v1/vacancy")
    public ResponseEntity<Object> respondForVacancy(@RequestParam("idVacancy") Long vacancyId,
                                                    @RequestParam("potentialEmployee") String potentialEmployeeJSON) {
        return ResponseEntity.status(HttpStatus.OK).body(vacancies.applyForVacancy (
                vacancyId,
                PotentialEmployeeMapper.mapJSON(potentialEmployeeJSON))
        );
    }

    @PostMapping(value = "/api/v1/vacancy/add")
    public ResponseEntity<Object> addVacancy(@RequestParam(value = "vacancy") String vacancyJSON) {
        return ResponseEntity.status(HttpStatus.OK).body(vacancies.addVacancy(VacancyMapper.mapJSON(vacancyJSON)));
    }

    @PostMapping("/api/v1/vacancy/potentialEmployee")
    public ResponseEntity<Object> acceptForVacancy(@RequestParam("vacancy") String vacancyJSON,
                                                   @RequestParam("potentialEmployee") String potentialEmployeeJSON) {
        vacancies.acceptForVacancyAndCloseVacancy(
                VacancyMapper.mapJSON(vacancyJSON),
                PotentialEmployeeMapper.mapJSON(potentialEmployeeJSON)
        );
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }

    //todo мб через патч
    //@PatchMapping(value = "/api/v1/vacancy")
    @PostMapping(value = "/api/v1/vacancy/edit")
    public ResponseEntity<Object> updateVacancy(@RequestParam("vacancy") String vacancyJSON) {
        return ResponseEntity.status(HttpStatus.OK).body(vacancies.editVacancy(VacancyMapper.mapJSON(vacancyJSON)));
    }

    //todo проверку на наличие
    @DeleteMapping(value = "/api/v1/vacancy/{vacancyId}")
    public ResponseEntity hideVacancyById(@PathVariable Long vacancyId) {
        vacancies.hideVacancyById(vacancyId);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }

}