package com.scravlon.springlogindemo.models;

import javax.persistence.*;

@Entity
@Table(name = "usertable")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String userName;
    private String password;
    private boolean active;
    private String roles;

    public User(){

    }

    public User(String userName, String password, boolean active, String roles) {
        this.userName = userName;
        this.password = password;
        this.active = active;
        this.roles = roles;
    }

    public User(int id, String userName, String password, boolean active, String roles) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.active = active;
        this.roles = roles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
