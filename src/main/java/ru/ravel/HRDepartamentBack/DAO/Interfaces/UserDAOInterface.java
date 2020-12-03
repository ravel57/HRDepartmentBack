package ru.ravel.HRDepartamentBack.DAO.Interfaces;

import ru.ravel.HRDepartamentBack.Models.systemUserDTO;

public interface UserDAOInterface {
//    List<User> getAllUser();
    systemUserDTO getUserByLoginAndPassword(String login, String password);
}
