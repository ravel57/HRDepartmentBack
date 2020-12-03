package ru.ravel.HRDepartamentBack.Models;

public class systemUsers {

    private long idUser;
    private String login;
    private String password;
    private String post;
    private String role;

    public systemUsers() {
    }

    public systemUsers(long idUser, String login, String password, String post, String roleId) {
        this.idUser = idUser;
        this.login = login;
        this.password = password;
        this.post = post;
        this.role = roleId;
    }


    public long getIdUser() {
        return idUser;
    }
    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPost() {
        return post;
    }
    public void setPost(String post) {
        this.post = post;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
}
