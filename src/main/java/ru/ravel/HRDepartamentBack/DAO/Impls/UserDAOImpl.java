package ru.ravel.HRDepartamentBack.DAO.Impls;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.ravel.HRDepartamentBack.DAO.Interfaces.UserDAOInterface;
import ru.ravel.HRDepartamentBack.Mappers.UserMapper;
import ru.ravel.HRDepartamentBack.Models.User;

@Repository
public class UserDAOImpl implements UserDAOInterface {
    private final JdbcTemplate jdbcTemplate;

    public UserDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

//    @Override
//    public List<User> getAllUser() {
//        return jdbcTemplate.query("select * from user", new UserMapper());
//    }

    public User getUserByLoginAndPasswordOrReturnNull(String login, String password) {
        User user;
        try {
            user = jdbcTemplate.queryForObject(
                    "SELECT users.id, employees.name, users.login, roles.role_name " +
                            "FROM `hr_department`.users " +
                            "join `hr_department`.roles on users.role_id = roles.id " +
                            "join `hr_department`.employees on employees.id = users.id " +
                            "where login like ? and password like ?",
                    new Object[]{login, password},
                    new UserMapper()
            );
            return user;
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
}
