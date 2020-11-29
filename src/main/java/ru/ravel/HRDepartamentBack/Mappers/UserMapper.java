package ru.ravel.HRDepartamentBack.Mappers;

import org.springframework.jdbc.core.RowMapper;
import ru.ravel.HRDepartamentBack.Models.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {

    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setIdUser(rs.getLong("idUser"));
        user.setLogin(rs.getString("login"));
        user.setPassword(rs.getString("password"));
        user.setPost(rs.getString("post"));
        user.setRole(rs.getString("name_role"));
        return user;
    }
}
