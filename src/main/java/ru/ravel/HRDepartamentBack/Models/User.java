package ru.ravel.HRDepartamentBack.Models;

public class User {

    private long idUser;
    private String name;
    private String login;
    private String role;

    public User() {
    }

    public User(long idUser, String login, String roleId) {
        this.idUser = idUser;
        this.login = login;
        this.role = roleId;
    }

    public long getIdUser() {
        return idUser;
    }
    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
}
