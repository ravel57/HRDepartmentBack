package ru.ravel.HRDepartamentBack.Models;

public class UserDTO {

    private long idUser;
    private String login;
    private String post;
    private String role;

    public UserDTO() {
    }

    public UserDTO(long idUser, String login, String post, String role) {
        this.idUser = idUser;
        this.login = login;
        this.post = post;
        this.role = role;
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


