package ru.ravel.HRDepartamentBack.Service.Impls;

import org.springframework.stereotype.Service;
import ru.ravel.HRDepartamentBack.DAO.Interfaces.EmployeeDAOInterface;
import ru.ravel.HRDepartamentBack.DAO.Interfaces.VacancyDAOInterface;
import ru.ravel.HRDepartamentBack.Models.PotentialEmployee;
import ru.ravel.HRDepartamentBack.Models.Vacancy;
import ru.ravel.HRDepartamentBack.Service.Interfaces.VacancyServiceInterface;

import java.util.List;

@Service
public class VacancyServiceImpl implements VacancyServiceInterface {

    private final VacancyDAOInterface vacancyDAOInterface;
    private final EmployeeDAOInterface employeeDAOInterface;

    public VacancyServiceImpl(VacancyDAOInterface vacancyDAOInterface, EmployeeDAOInterface employeeDAOInterface) {
        this.vacancyDAOInterface = vacancyDAOInterface;
        this.employeeDAOInterface = employeeDAOInterface;
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
    public List<PotentialEmployee> getApplicantsForVacancies(long vacancyId) {
        return vacancyDAOInterface.getApplicantsForVacancies(vacancyId);
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

    @Override
    public void acceptForVacancyAndCloseVacancy(Vacancy vacancy, PotentialEmployee potentialEmployee) {
//        this.hideVacancyById(vacancy.getId());
        employeeDAOInterface.addEmployee(vacancy, potentialEmployee);
    }
}
