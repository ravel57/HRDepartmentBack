package ru.ravel.HRDepartamentBack.DAO.Interfaces;

import ru.ravel.HRDepartamentBack.Models.User;

public interface UserDAOInterface {
//    List<User> getAllUser();
    User getUserByLoginAndPasswordOrReturnNull(String login, String password);
}
