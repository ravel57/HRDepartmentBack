package ru.ravel.HRDepartamentBack.Service.Interfaces;

import ru.ravel.HRDepartamentBack.Models.User;

public interface systemUserDTOServiceInterface {
//    List<User> getAllUser();
    User authorizeUser(String login, String password);
}
