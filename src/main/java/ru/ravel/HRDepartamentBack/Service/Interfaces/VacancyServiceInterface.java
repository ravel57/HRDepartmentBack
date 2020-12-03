package ru.ravel.HRDepartamentBack.Service.Interfaces;

import ru.ravel.HRDepartamentBack.Models.PotentialEmployee;
import ru.ravel.HRDepartamentBack.Models.Vacancy;

import java.util.List;

public interface VacancyServiceInterface {
    List<Vacancy> getAllVacancy();

    List<Vacancy> getActualVacancy();

    List<PotentialEmployee> getRespondedOnVacancy(long vacancyId);

//    Vacancy addPhoneNumberOnVacancy(long vacancyId, String phoneNumber);

    Vacancy applyForVacancy(long vacancyId, PotentialEmployee potentialEmployee);

    void hideVacancyById(long vacancyId);

    Vacancy addVacancy(Vacancy vacancy);

    Vacancy editVacancy(Vacancy vacancy);

}
