package ru.ravel.HRDepartamentBack.Service.Impls;

import org.springframework.stereotype.Service;
import ru.ravel.HRDepartamentBack.DAO.Interfaces.VacancyDAOInterface;
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
        return vacancyDAOInterface.getAllVacancy();
    }

    @Override
    public List<Vacancy> getActualVacancy() {
        return vacancyDAOInterface.getActualVacancy();
    }

    @Override
    public Vacancy addPhoneNumberOnVacancy(long vacancyId, String phoneNumber) {
        return vacancyDAOInterface.addPhoneNumberOnVacancy(vacancyId, phoneNumber);
    }

    @Override
    public void hideVacancyById(long vacancyId) {
        vacancyDAOInterface.hideVacancyById(vacancyId);
    }

    @Override
    public Vacancy addVacancy(Vacancy vacancy) {
        return vacancyDAOInterface.addVacancy(vacancy);
    }
}
