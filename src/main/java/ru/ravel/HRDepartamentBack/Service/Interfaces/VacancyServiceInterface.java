package ru.ravel.HRDepartamentBack.Service.Interfaces;

import ru.ravel.HRDepartamentBack.Models.PotentialEmployee;
import ru.ravel.HRDepartamentBack.Models.Vacancy;

import java.util.List;

public interface VacancyServiceInterface {
    /** все вакансии */
    List<Vacancy> getAllVacancy();

    /** все актуальные вакансит */
    List<Vacancy> getActualVacancy();

    /** все откликнувшиеся на выбранную вакансию */
    List<PotentialEmployee> getApplicantsForVacancies(long vacancyId);

    /** откликнуться на вакансию */
    Vacancy applyForVacancy(long vacancyId, PotentialEmployee potentialEmployee);

    /** закрыть вакансию */
    void hideVacancyById(long vacancyId);

    /** добавить вакансию */
    Vacancy addVacancy(Vacancy vacancy);

    /** отредактировать вакансию */
    Vacancy editVacancy(Vacancy vacancy);

    /** сделать соискателя сотрудником и закрыть вакансию */
    void acceptForVacancyAndCloseVacancy(Vacancy vacancy, PotentialEmployee potentialEmployee);
}
