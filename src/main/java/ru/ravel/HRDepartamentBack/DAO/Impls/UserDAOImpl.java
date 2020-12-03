package ru.ravel.HRDepartamentBack.DAO.Impls;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.ravel.HRDepartamentBack.DAO.Interfaces.UserDAOInterface;
import ru.ravel.HRDepartamentBack.Mappers.UserMapper;
import ru.ravel.HRDepartamentBack.Models.systemUserDTO;

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

    public systemUserDTO getUserByLoginAndPassword(String login, String password) {
        systemUserDTO systemUserDTO;
        try {
            systemUserDTO = jdbcTemplate.queryForObject(
                    "SELECT system_users.id, system_users.login, system_users.post_id, role.role_name\n" +
                            "FROM `hr_department`.system_users\n" +
                            "         join `hr_department`.role on system_users.role_id = role.id\n" +
                            "where login like ? and password like ?;",
                    new Object[]{login, password},
                    new UserMapper()
            );
            return systemUserDTO;
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
}
