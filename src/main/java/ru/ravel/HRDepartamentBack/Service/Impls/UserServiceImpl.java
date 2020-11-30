package ru.ravel.HRDepartamentBack.Service.Impls;

import org.springframework.stereotype.Service;
import ru.ravel.HRDepartamentBack.DAO.Interfaces.UserDAOInterface;
import ru.ravel.HRDepartamentBack.Models.User;
import ru.ravel.HRDepartamentBack.Models.UserDTO;
import ru.ravel.HRDepartamentBack.Service.Interfaces.UserServiceInterface;

import java.util.List;

@Service
public class UserServiceImpl implements UserServiceInterface {

    private final UserDAOInterface userDAOInterface;

    public UserServiceImpl(UserDAOInterface userDAOInterface) {
        this.userDAOInterface = userDAOInterface;
    }


//    @Override
//    public List<User> getAllUser() {
//        return userDAOInterface.getAllUser();
//    }

    @Override
    public UserDTO authorizeUser(String login, String password) {
        return userDAOInterface.getUserByLoginAndPassword(login, password);
    }

}
