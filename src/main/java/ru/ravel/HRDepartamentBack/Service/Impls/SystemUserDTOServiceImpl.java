package ru.ravel.HRDepartamentBack.Service.Impls;

import org.springframework.stereotype.Service;
import ru.ravel.HRDepartamentBack.DAO.Interfaces.UserDAOInterface;
import ru.ravel.HRDepartamentBack.Models.User;
import ru.ravel.HRDepartamentBack.Service.Interfaces.systemUserDTOServiceInterface;

@Service
public class SystemUserDTOServiceImpl implements systemUserDTOServiceInterface {

    private final UserDAOInterface userDAOInterface;

    public SystemUserDTOServiceImpl(UserDAOInterface userDAOInterface) {
        this.userDAOInterface = userDAOInterface;
    }


//    @Override
//    public List<User> getAllUser() {
//        return userDAOInterface.getAllUser();
//    }

    @Override
    public User authorizeUser(String login, String password) {
        return userDAOInterface.getUserByLoginAndPasswordOrReturnNull(login, password);
    }

}
