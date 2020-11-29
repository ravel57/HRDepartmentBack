package ru.ravel.HRDepartamentBack.Service;

import org.springframework.stereotype.Service;
import ru.ravel.HRDepartamentBack.Models.Employee;
import ru.ravel.HRDepartamentBack.Models.User;
import ru.ravel.HRDepartamentBack.Models.UserDTO;

import java.util.List;

public interface UserServiceInterface {
    List<User> getAllUser();
    UserDTO authorizeUser(String login, String password);
}
