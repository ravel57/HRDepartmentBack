package ru.ravel.HRDepartamentBack.DAO.Impls;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.ravel.HRDepartamentBack.DAO.Interfaces.VacancyDAOInterface;
import ru.ravel.HRDepartamentBack.Mappers.PotentialEmployeeMapper;
import ru.ravel.HRDepartamentBack.Mappers.VacancyMapper;
import ru.ravel.HRDepartamentBack.Models.PotentialEmployee;
import ru.ravel.HRDepartamentBack.Models.Vacancy;

import java.util.List;

@Repository
public class VacancyDAOImpl implements VacancyDAOInterface {

    private final JdbcTemplate jdbcTemplate;

    public VacancyDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Vacancy> getAllVacancies() {
        return jdbcTemplate.query("select * from vacancy;", new VacancyMapper());
    }

    @Override
    public List<Vacancy> getActualVacancies() {
        return jdbcTemplate.query("select * from vacancy where vacancy.state_id > 0;", new VacancyMapper());
    }

    @Override
    public List<PotentialEmployee> getRespondedOnVacancy(long vacancyId) {
        return jdbcTemplate.query(
                "SELECT name, phone_number, potential_employee.city, letter " +
                        "FROM hr_department.potential_employee " +
                        "join vacancy on vacancy.id = potential_employee.vacancy_id " +
                        "where vacancy.id = ?;",
                new Object[]{vacancyId},
                new PotentialEmployeeMapper()
        );
    }

    @Override
    public Vacancy applyForVacancy(long vacancyId, PotentialEmployee potentialEmployee) {
        try {
            jdbcTemplate.update(
                    "INSERT INTO potential_employee (vacancy_id, name, phone_number, city, letter) " +
                            "VALUES (?, ?, ?, ?, ?)",
                    vacancyId, potentialEmployee.getName(), potentialEmployee.getPhoneNumber(),
                    potentialEmployee.getCity(), potentialEmployee.getLetter()
            );
            return jdbcTemplate.queryForObject(
                    "select * from vacancy  where id = ?;",
                    new Object[]{vacancyId},
                    new VacancyMapper()
            );
        } catch (DataAccessException e) {
            return null;
        }
    }


//    @Override
//    public Vacancy addPhoneNumberOnVacancy(long vacancyId, String phoneNumber) {
//        jdbcTemplate.update(
//                "INSERT INTO visitors_vacancies (vacancy_id, phone_number) " +
//                        "VALUES (?, ?);",
//                vacancyId, phoneNumber);
//        return jdbcTemplate.queryForObject(
//                "select * from vacancy where id = ? and state_id > 0",
//                new Object[]{vacancyId},
//                new VacancyMapper()
//        );
//    }

    @Override
    public void hideVacancyById(long vacancyId) {
        jdbcTemplate.update("UPDATE vacancy SET state_id = 0 WHERE id = ?;", vacancyId);
    }

    public Vacancy addVacancy(Vacancy vacancy) {
        try {
            jdbcTemplate.update(
                    "INSERT INTO vacancy (city, category, job_type, role, requirements," +
                            "opening_date, state_id, project_id) " +
                            "VALUES (?, ?, ?, ?, ?, ?, ?, ?) ",
                    vacancy.getCity(), vacancy.getCategory(),
                    vacancy.getJobType(), vacancy.getRole(),
                    vacancy.getRequirement(), vacancy.getOpeningDate(),
                    vacancy.getStateId(), vacancy.getProjectId()
            );
            return jdbcTemplate.queryForObject(
                    "select * from vacancy " +
                            "where id = (select max(id) from vacancy);",
                    new VacancyMapper()
            );
        } catch (DataAccessException e) {
            return null;
        }
    }

    @Override
    public Vacancy editVacancy(Vacancy vacancy) {
        try {
            jdbcTemplate.update(
                    "UPDATE vacancy\n" +
                        "SET city = ?, category = ?, job_type = ?, role = ?, requirements = ?\n" +
                        "where vacancy.id = ?;\n",
                    vacancy.getCity(),
                    vacancy.getCategory(),
                    vacancy.getJobType(),
                    vacancy.getRole(),
                    vacancy.getRequirement(),
                    vacancy.getId()
            );
            return jdbcTemplate.queryForObject(
                    "select * from vacancy where id = ?;",
                    new Object[]{vacancy.getId()},
                    new VacancyMapper()
            );
        } catch (DataAccessException e) {
            return null;
        }
    }

//    public boolean checkVacancyActuality(long vacancyId) {
//        return jdbcTemplate.query("select * from vacancy where state_id > 0 and idVacancy = ?",
//                vacancyId},
//                new VacancyMapper()).size() > 0;
//    }
}
