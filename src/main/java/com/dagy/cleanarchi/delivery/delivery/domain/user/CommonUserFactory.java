package com.dagy.cleanarchi.delivery.delivery.domain.user;

public class CommonUserFactory implements UserFactory {
    @Override
    public User create(String name, String password) {
        return new CommonUser(name, password);
    }
}
