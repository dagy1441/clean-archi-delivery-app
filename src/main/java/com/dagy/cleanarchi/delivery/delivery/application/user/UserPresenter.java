package com.dagy.cleanarchi.delivery.delivery.application.user;

import com.dagy.cleanarchi.delivery.delivery.application.user.model.UserResponseModel;

public interface UserPresenter {
    UserResponseModel prepareSuccessView(UserResponseModel user);

    UserResponseModel prepareFailView(String error);
}
