package ru.ravel.HRDepartamentBack.Service.Impls;

import org.springframework.stereotype.Service;
import ru.ravel.HRDepartamentBack.DAO.Interfaces.VacancyDAOInterface;
import ru.ravel.HRDepartamentBack.Models.PotentialEmployee;
import ru.ravel.HRDepartamentBack.Models.Vacancy;
import ru.ravel.HRDepartamentBack.Service.Interfaces.VacancyServiceInterface;

import java.util.List;

@Service
public class VacancyServiceImpl implements VacancyServiceInterface {

    private final VacancyDAOInterface vacancyDAOInterface;

    public VacancyServiceImpl(VacancyDAOInterface vacancyDAOInterface) {
        this.vacancyDAOInterface = vacancyDAOInterface;
    }


    @Override
    public List<Vacancy> getAllVacancy() {
        return vacancyDAOInterface.getAllVacancies();
    }

    @Override
    public List<Vacancy> getActualVacancy() {
        return vacancyDAOInterface.getActualVacancies();
    }

    @Override
    public List<PotentialEmployee> getRespondedOnVacancy(long vacancyId) {
        return vacancyDAOInterface.getRespondedOnVacancy(vacancyId);
    }

    @Override
    public Vacancy applyForVacancy(long vacancyId, PotentialEmployee potentialEmployee) {
        return vacancyDAOInterface.applyForVacancy(vacancyId, potentialEmployee);
    }


    @Override
    public void hideVacancyById(long vacancyId) {
        vacancyDAOInterface.hideVacancyById(vacancyId);
    }

    @Override
    public Vacancy addVacancy(Vacancy vacancy) {
        return vacancyDAOInterface.addVacancy(vacancy);
    }

    @Override
    public Vacancy editVacancy(Vacancy vacancy) {
        return vacancyDAOInterface.editVacancy(vacancy);
    }
}
