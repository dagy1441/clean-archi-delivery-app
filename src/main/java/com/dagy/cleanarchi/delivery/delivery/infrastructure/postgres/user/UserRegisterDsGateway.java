package com.dagy.cleanarchi.delivery.delivery.infrastructure.postgres.user;

import com.dagy.cleanarchi.delivery.delivery.application.user.model.UserDsRequestModel;

public interface UserRegisterDsGateway {
    boolean existsByName(String identifier);

    void save(UserDsRequestModel requestModel);
}
