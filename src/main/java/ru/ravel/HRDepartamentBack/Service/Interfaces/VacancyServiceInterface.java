package ru.ravel.HRDepartamentBack.Service.Interfaces;

import ru.ravel.HRDepartamentBack.Models.Vacancy;

import java.util.List;

public interface VacancyServiceInterface {
    List<Vacancy> getAllVacancy();
    List<Vacancy> getActualVacancy();
    Vacancy addPhoneNumberOnVacancy(long vacancyId, String phoneNumber);
    void hideVacancyById(long vacancyId);
    Vacancy addVacancy(Vacancy vacancy);
}
