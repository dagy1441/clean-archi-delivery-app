package com.dagy.cleanarchi.delivery.delivery.domain.user;

interface User {
    boolean passwordIsValid();

    String getName();

    String getPassword();
}
