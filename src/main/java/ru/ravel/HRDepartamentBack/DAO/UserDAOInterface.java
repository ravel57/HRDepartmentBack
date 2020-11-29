package ru.ravel.HRDepartamentBack.DAO;

import ru.ravel.HRDepartamentBack.Models.Employee;
import ru.ravel.HRDepartamentBack.Models.User;

import java.util.List;

public interface UserDAOInterface {
    List<User> getAllUser();
    User getUserByLoginAndPassword(String login, String password);
}
