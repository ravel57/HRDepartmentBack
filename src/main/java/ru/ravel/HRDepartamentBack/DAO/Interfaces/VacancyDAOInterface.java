package ru.ravel.HRDepartamentBack.DAO.Interfaces;

import ru.ravel.HRDepartamentBack.Models.Vacancy;

import java.util.List;

public interface VacancyDAOInterface {
    List<Vacancy> getAllVacancy();
    List<Vacancy> getActualVacancy();
    Vacancy addPhoneNumberOnVacancy(long vacancyId, String phoneNumber);
    void hideVacancyById(long vacancyId);
    Vacancy addVacancy(Vacancy vacancy);
//    public boolean checkVacancyActuality(long vacancyId);

}
