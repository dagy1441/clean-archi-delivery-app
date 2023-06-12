package com.dagy.cleanarchi.delivery.delivery.application.user.repository;

import com.dagy.cleanarchi.delivery.delivery.application.user.model.UserDsRequestModel;

public interface UserRegisterDsGateway {
    boolean existsByName(String identifier);

    void save(UserDsRequestModel requestModel);
}
