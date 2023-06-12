package com.dagy.cleanarchi.delivery.delivery.application.user.model;

public class UserRequestModel {
    String name;
    String password;

    public UserRequestModel() {
        super();
    }

    UserRequestModel(String name, String password) {
        super();
        this.name = name;
        this.password = password;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getPassword() {
        return password;
    }

    void setPassword(String password) {
        this.password = password;
    }
}
