package ru.ravel.HRDepartamentBack.Service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ru.ravel.HRDepartamentBack.DAO.UserDAOInterface;
import ru.ravel.HRDepartamentBack.Models.User;
import ru.ravel.HRDepartamentBack.Models.UserDTO;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserServiceInterface {

    private final UserDAOInterface userDAOInterface;

    public UserServiceImpl(UserDAOInterface userDAOInterface) {
        this.userDAOInterface = userDAOInterface;
    }

    @Override
    public List<User> getAllUser() {
        return userDAOInterface.getAllUser();
    }

    @Override
    public UserDTO authorizeUser(String login, String password) {
        User user = userDAOInterface.getUserByLoginAndPassword(login, password);
        return new UserDTO(user.getIdUser(), user.getLogin(), user.getPost(), user.getRole());
    }

}
