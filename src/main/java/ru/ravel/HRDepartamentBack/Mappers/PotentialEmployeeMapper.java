package ru.ravel.HRDepartamentBack.Mappers;

import org.springframework.jdbc.core.RowMapper;
import ru.ravel.HRDepartamentBack.Models.PotentialEmployee;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PotentialEmployeeMapper implements RowMapper<PotentialEmployee> {

    @Override
    public PotentialEmployee mapRow(ResultSet rs, int rowNum) throws SQLException {
        PotentialEmployee potentialEmployee = new PotentialEmployee();
        potentialEmployee.setIdPotentialEmployee(rs.getLong("set_idPotential_employee"));
        potentialEmployee.setName(rs.getString("name"));
        potentialEmployee.setCity(rs.getString("city"));
        potentialEmployee.setLetter(rs.getString("letter"));
        potentialEmployee.setIdVacancy(rs.getLong("id_vacancy"));
        return potentialEmployee;
    }

}
