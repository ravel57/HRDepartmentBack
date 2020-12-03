package ru.ravel.HRDepartamentBack.Mappers;

import org.springframework.jdbc.core.RowMapper;
import ru.ravel.HRDepartamentBack.Models.systemUserDTO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<systemUserDTO> {

    public systemUserDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
        systemUserDTO user = new systemUserDTO();
        user.setIdUser(rs.getLong("id"));
        user.setLogin(rs.getString("login"));
//        user.setPassword(rs.getString("password"));
        user.setPost(rs.getString("post_id"));
        user.setRole(rs.getString("role_name"));
        return user;
    }
}
