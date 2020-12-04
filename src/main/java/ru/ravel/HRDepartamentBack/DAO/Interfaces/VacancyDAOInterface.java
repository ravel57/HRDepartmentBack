package ru.ravel.HRDepartamentBack.DAO.Interfaces;

import ru.ravel.HRDepartamentBack.Models.PotentialEmployee;
import ru.ravel.HRDepartamentBack.Models.Vacancy;

import java.util.List;

public interface VacancyDAOInterface {
    List<Vacancy> getAllVacancies();

    List<Vacancy> getActualVacancies();

    List<PotentialEmployee> getApplicantsForVacancies(long vacancyId);

    Vacancy applyForVacancy(long vacancyId, PotentialEmployee potentialEmployee);

    void hideVacancyById(long vacancyId);

    Vacancy addVacancy(Vacancy vacancy);

    Vacancy editVacancy(Vacancy vacancy);
}
