package ru.ravel.HRDepartamentBack.DAO.Impls;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.ravel.HRDepartamentBack.DAO.Interfaces.VacancyDAOInterface;
import ru.ravel.HRDepartamentBack.Mappers.VacancyMapper;
import ru.ravel.HRDepartamentBack.Models.Vacancy;

import java.util.List;

@Repository
public class VacancyDAOImpl implements VacancyDAOInterface {

    private final JdbcTemplate jdbcTemplate;

    public VacancyDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Vacancy> getAllVacancy() {
        return jdbcTemplate.query("select * from vacancy;", new VacancyMapper());
    }

    @Override
    public List<Vacancy> getActualVacancy() {
        return jdbcTemplate.query("select * from vacancy where vacancy.state_id >= 1;", new VacancyMapper());
    }


    @Override
    public Vacancy addPhoneNumberOnVacancy(long vacancyId, String phoneNumber) {
        jdbcTemplate.update(
                "INSERT INTO visitors_vacancies (vacancy_id, phone_number) " +
                        "VALUES (?, ?);",
                vacancyId, phoneNumber);
        return jdbcTemplate.queryForObject(
                "select * from vacancy where id = ? and state_id > 0",
                new Object[]{vacancyId},
                new VacancyMapper()
        );
    }

    @Override
    public void hideVacancyById(long vacancyId) {
        jdbcTemplate.query(
                "UPDATE vacancy SET state_id = 0 WHERE idVacancy = ?;",
                new Object[]{vacancyId},
                new VacancyMapper()
        );
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

//    public boolean checkVacancyActuality(long vacancyId) {
//        return jdbcTemplate.query("select * from vacancy where state_id > 0 and idVacancy = ?",
//                vacancyId},
//                new VacancyMapper()).size() > 0;
//    }
}
