package com.dagy.cleanarchi.delivery.delivery.infrastructure.postgres.user;

import com.dagy.cleanarchi.delivery.delivery.application.user.model.UserRequestModel;
import com.dagy.cleanarchi.delivery.delivery.application.user.model.UserResponseModel;
import com.dagy.cleanarchi.delivery.delivery.application.user.usecase.UserInputBoundary;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class UserRegisterController {

    final UserInputBoundary userInput;

    UserRegisterController(UserInputBoundary accountGateway) {
        this.userInput = accountGateway;
    }

    @PostMapping("/user")
    UserResponseModel create(@RequestBody UserRequestModel requestModel) {
        return userInput.create(requestModel);
    }
}
