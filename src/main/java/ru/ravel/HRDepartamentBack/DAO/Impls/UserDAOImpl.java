package ru.ravel.HRDepartamentBack.DAO.Impls;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.ravel.HRDepartamentBack.DAO.Interfaces.UserDAOInterface;
import ru.ravel.HRDepartamentBack.Mappers.UserMapper;
import ru.ravel.HRDepartamentBack.Models.User;
import ru.ravel.HRDepartamentBack.Models.UserDTO;

import java.util.List;

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

    public UserDTO getUserByLoginAndPassword(String login, String password) {
        UserDTO userDTO;
        try {
            userDTO = jdbcTemplate.queryForObject(
                    "SELECT idUser, login, post, name_role\n" +
                            "FROM hr_department.user\n" +
                            "join hr_department.role on user.role_id = role.id_role\n" +
                            "where login like ? and password like ?;",
                    new Object[]{login, password},
                    new UserMapper()
            );
            return userDTO;
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
}
