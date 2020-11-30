package ru.ravel.HRDepartamentBack.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.ravel.HRDepartamentBack.Models.UserDTO;
import ru.ravel.HRDepartamentBack.Models.UserRoleEnum;
import ru.ravel.HRDepartamentBack.Service.Interfaces.UserServiceInterface;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashSet;
import java.util.Set;

@Controller
public class AuthController {
    @Autowired
    UserServiceInterface user;


    @PostMapping(value = "/api/v1/auth")
    public ResponseEntity<Object> auth(@RequestParam("login") String login, @RequestParam("password") String password) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        Set<GrantedAuthority> roles = new HashSet<>();

        roles.add(new SimpleGrantedAuthority(UserRoleEnum.USER.name()));
        Authentication auth = new UsernamePasswordAuthenticationToken(login, passwordEncoder.encode(password), roles);
        SecurityContextHolder.getContext().setAuthentication(auth);

        UserDTO authUser = user.authorizeUser(login, password);

        if (authUser != null)
            return ResponseEntity.status(HttpStatus.OK).body(authUser);
        else
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
    }

    @PostMapping("/api/v1/logout")
    public void logout(HttpServletRequest request, HttpServletResponse response) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        SecurityContextLogoutHandler securityContextHolder = new SecurityContextLogoutHandler();
        securityContextHolder.logout(request, response, null);
    }
}
