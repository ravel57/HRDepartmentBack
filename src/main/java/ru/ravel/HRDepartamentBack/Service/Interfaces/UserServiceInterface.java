package ru.ravel.HRDepartamentBack.Service.Interfaces;

import ru.ravel.HRDepartamentBack.Models.systemUserDTO;

public interface UserServiceInterface {
//    List<User> getAllUser();
    systemUserDTO authorizeUser(String login, String password);
}
