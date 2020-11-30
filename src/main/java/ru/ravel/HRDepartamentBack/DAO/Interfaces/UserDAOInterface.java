package ru.ravel.HRDepartamentBack.DAO.Interfaces;

import ru.ravel.HRDepartamentBack.Models.Employee;
import ru.ravel.HRDepartamentBack.Models.User;
import ru.ravel.HRDepartamentBack.Models.UserDTO;

import java.util.List;

public interface UserDAOInterface {
//    List<User> getAllUser();
    UserDTO getUserByLoginAndPassword(String login, String password);
}
