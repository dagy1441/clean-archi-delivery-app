package com.dagy.cleanarchi.delivery.delivery.application.user.usecase;

import com.dagy.cleanarchi.delivery.delivery.application.user.model.UserRequestModel;
import com.dagy.cleanarchi.delivery.delivery.application.user.model.UserResponseModel;

public interface UserInputBoundary {
    UserResponseModel create(UserRequestModel requestModel);
}
